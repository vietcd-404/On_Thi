package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "hoadon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahoadon")
    private long maHoaDon;

    @Column(name = "ngaylap")
    private Date ngayLap;

    @Column(name = "nguoilap")
    private String nguoiLap;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "ngaythanhtoan")
    private Date ngayThanhToan;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "nguoimua")
    private KhachHang nguoiMua;

//    @OneToMany(mappedBy = "maHoaDon")
//    private List<PhieuGiaoHang> phieuGiaoHangList;
//
//    @OneToMany(mappedBy = "maHoaDon")
//    private List<HoaDonChiTiet> hoaDonChiTietList;
}
