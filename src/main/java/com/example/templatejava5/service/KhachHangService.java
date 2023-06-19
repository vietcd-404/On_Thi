package com.example.templatejava5.service;

import com.example.templatejava5.entity.KhachHang;
import com.example.templatejava5.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    public Page<KhachHang> getPage(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    public KhachHang add(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    public boolean delete(Integer id) {
        khachHangRepository.deleteById(id);
        return true;
    }

    public KhachHang update(Integer id, KhachHang khachHang) {
        KhachHang khachHang1 = this.khachHangRepository.findById(khachHang.getMaKhachHang()).orElse(null);
        khachHang1.setTenKhachHang(khachHang.getTenKhachHang());
        khachHang1.setGioiTinh(khachHang.isGioiTinh());
        khachHang1.setSoDienThoai(khachHang.getSoDienThoai());
        khachHang1.setHangKhachHang(khachHang.getHangKhachHang());
        return khachHangRepository.save(khachHang1);
    }

    public KhachHang findId(Integer id) {
        return khachHangRepository.findById(id).orElse(null);
    }
}
