package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "giohang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GioHang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "magiohang")
    private String maGioHang;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "ngaycapnhap")
    private Date ngayCapNhat;

    @ManyToOne
    @JoinColumn(name = "nguoisohuu")
    private KhachHang maKhachHang;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

//    @OneToMany(mappedBy = "maGioHang")
//    private List<GioHangChiTiet> gioHangChiTietList;

}
