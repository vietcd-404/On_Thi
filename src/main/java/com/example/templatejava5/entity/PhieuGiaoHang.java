package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "phieugiaohang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhieuGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "maphieugiao")
    private String maPhieuTao;

    @Column(name = "nguoinhan")
    private String nguoiNhan;

    @Column(name = "nguoigiao")
    private Date ngayGiao;

    @Column(name = "sdtgiao")
    private String sdtGiao;

    @Column(name = "ngaynhan")
    private Date ngayNhan;

    @Column(name = "nguoitao")
    private String nguoiTao;

    @Column(name = "phigiaohang")
    private BigDecimal phiGiaoHang;

    @ManyToOne
    @JoinColumn(name = "hoadongiao")
    private HoaDon maHoaDon;

    @ManyToOne
    @JoinColumn(name = "diachigiao")
    private DiaChi maDiaChi;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

}
