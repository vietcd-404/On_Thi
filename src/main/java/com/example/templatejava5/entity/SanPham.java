package com.example.templatejava5.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "sanpham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masanpham")
    private Integer maSanPham;

    @Column(name = "tensanpham")
    private String tenSanPham;

    @Column(name = "chatlieu")
    private String chatLieu;

    @Column(name = "giachatlieu")
    private BigDecimal giaChetLieu;

    @Column(name = "soluongton")
    private int soLuongTon;

    @Column(name = "loaisanpham")
    private String loaiSanPham;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "mausac")
    private String mauSac;

    @Column(name = "nhasanxuat")
    private String nhaSanXuat;

    @Column(name = "trangthai")
    private int trangThai;

//    @OneToMany(mappedBy = "maSanPham")
//    private List<YeuThichChiTiet> yeuThichChiTietList;
//
//    @OneToMany(mappedBy = "maSanPham")
//    private List<GioHangChiTiet> gioHangChiTietList;


}
