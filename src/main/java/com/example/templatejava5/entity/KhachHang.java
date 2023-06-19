package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "khachhang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhachhang")
    private Integer maKhachHang;

    @Column(name = "tenkhachhang")
    private String tenKhachHang;

    @Column(name = "sinhnhat")
    private Date sinhNhat;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "sodienthoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

    @Column(name = "gioitinh")
    private boolean gioiTinh;

    @Column(name = "chungminhthu")
    private String chungMinhThu;

    @Column(name = "socancuoc")
    private String soCanCuoc;

    @Column(name = "anhdaidien")
    private String anhDaiDien;

    @Column(name = "trangthai")
    private int trangThai;

    @Column(name = "diemtichluy")
    private int diemTichLuy;

    @ManyToOne
    @JoinColumn(name = "hangkhachhang")
    private HangKhachHang hangKhachHang;

    @ManyToOne
    @JoinColumn(name = "nguoigioithieu")
    private KhachHang nguoiGioiThieu;
}
