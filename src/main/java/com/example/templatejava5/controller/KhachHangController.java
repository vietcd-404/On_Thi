package com.example.templatejava5.controller;

import com.example.templatejava5.entity.HangKhachHang;
import com.example.templatejava5.entity.KhachHang;
import com.example.templatejava5.repository.HangKhachHangRepository;
import com.example.templatejava5.service.HangKhachHangService;
import com.example.templatejava5.service.KhachHangService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private HangKhachHangService hangKhachHangService;

    @GetMapping("/hien-thi")
    public String view(Model model, @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                       @RequestParam(name = "pageSize", required = false, defaultValue = "5") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        Page<KhachHang> page = khachHangService.getPage(pageable);
        List<HangKhachHang> list = this.hangKhachHangService.getList();
        model.addAttribute("listKhachHang", list);
        model.addAttribute("totalPage", page.getTotalPages());
        model.addAttribute("list", page.getContent());
        return "index";
    }

    @PostMapping("/add")
    public String add(KhachHang khachHang) {
        khachHangService.add(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/delete/{maKhachHang}")
    public String delete(@PathVariable("maKhachHang") Integer id) {
        khachHangService.delete(id);
        return "redirect:/khach-hang/hien-thi";
    }

    @PostMapping("/update/{maKhachHang}")
    public String update(@PathVariable("maKhachHang") Integer id, KhachHang khachHang) {
        khachHangService.update(id, khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
    @GetMapping("/update/{maKhachHang}")
    public String viewUpate(Model model,@PathVariable("maKhachHang") Integer id){
        KhachHang khachHang = this.khachHangService.findId(id);
        List<HangKhachHang> list = this.hangKhachHangService.getList();
        model.addAttribute("listKhachHang", list);
        model.addAttribute("list",khachHang);
        return "update";
    }
}
