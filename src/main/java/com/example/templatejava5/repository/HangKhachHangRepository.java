package com.example.templatejava5.repository;

import com.example.templatejava5.entity.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang,Integer> {
}
