package com.example.templatejava5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "yeuthichchitiet")
public class YeuThichChiTiet {

    @Id
    @ManyToOne
    @JoinColumn(name = "madanhsach")
    private DanhSachYeuThich maDanhSach;

    @Id
    @ManyToOne
    @JoinColumn(name = "masanpham")
    private SanPham maSanPham;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

    // getters setters
}
