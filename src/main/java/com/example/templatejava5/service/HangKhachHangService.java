package com.example.templatejava5.service;

import com.example.templatejava5.entity.HangKhachHang;
import com.example.templatejava5.repository.HangKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangKhachHangService {
    @Autowired
    private HangKhachHangRepository hangKhachHangRepository;

    public List<HangKhachHang> getList(){
        return hangKhachHangRepository.findAll();
    }

}
