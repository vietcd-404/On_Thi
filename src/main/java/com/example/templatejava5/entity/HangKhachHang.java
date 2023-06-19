package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hangkhachhang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HangKhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahang")
    private Integer maHang;

    @Column(name = "tenhang")
    private String tenHang;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "diemtoithieu")
    private int diemToiThieu;

    @Column(name = "trangthai")
    private int trangThai;
//
//    @OneToMany(mappedBy = "hangKhachHang")
//    private List<KhachHang> khachHangList;

}
