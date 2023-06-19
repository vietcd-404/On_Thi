package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "danhsachyeuthich")
public class DanhSachYeuThich {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "madanhsach")
    private String maDanhSach;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "ngaycapnhap")
    private Date ngayCapNhap;

    @ManyToOne
    @JoinColumn(name = "nguoisohuu")
    private KhachHang maKhachHang;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

//    @OneToMany(mappedBy = "maDanhSach")
//    private List<YeuThichChiTiet> yeuThichChiTietList;
}
