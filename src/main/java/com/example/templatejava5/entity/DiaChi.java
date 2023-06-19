package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "diachi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiaChi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "madiachi")
    private String maDiaChi;

    @Column(name = "tendiachi")
    private String tendiachi;

    @Column(name = "motachitiet")
    private String moTaChiTiet;

    @Column(name = "tinhthanhpho")
    private String tinhThanhPho;

    @Column(name = "quanhuyen")
    private String quanHuyen;

    @Column(name = "phuongxa")
    private String phuongXa;

    @Column(name = "duongpho")
    private String duongPho;

    @ManyToOne
    @JoinColumn(name = "makhachhang")
    private KhachHang khachHang;

//    @OneToMany(mappedBy = "maDiaChi")
//    private List<PhieuGiaoHang> phieuGiaoHangList;
}
