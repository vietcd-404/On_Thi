package com.example.templatejava5.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "giohangchitiet")
public class GioHangChiTiet {
    @Id
    @ManyToOne
    @JoinColumn(name = "magiohang")
    private GioHang maGioHang;

    @Id
    @ManyToOne
    @JoinColumn(name = "masanpham")
    private SanPham maSanPham;

    @Column(name = "soluong")
    private int soLuong;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;
}
