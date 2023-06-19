package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "thethanhvien")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheThanhVien {

    @Id
    @Column(name = "mathe")
    private String maThe;

    @Column(name = "mauthe")
    private String mauThe;

    @Column(name = "loaithe")
    private String loaiThe;

    @Column(name = "ngayphathanh")
    private Date ngayPhatHang;

    @Column(name = "ngayhuy")
    private Date ngayHuy;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "nguoisudung")
    private KhachHang maKhachHang;
}
