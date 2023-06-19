package com.example.templatejava5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "phieugiamgia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhieuGiamGia {

    @Id
    @Column(name = "maphieu")
    private String maPhieu;

    @Column(name = "tenphieu")
    private String tenPhieu;

    @Column(name = "ngaybatdau")
    private Date ngayBatDau;

    @Column(name = "ngayketthuc")
    private Date ngayKetThuc;

    @Column(name = "giatrigiam")
    private BigDecimal giaTriGiam;

    @Column(name = "giatrigiamtoida")
    private BigDecimal giaTriGiamToiDa;

    @Column(name = "trangthai")
    private int trangThai;

    @Column(name = "hinhthucgiam")
    private boolean hinhThucGiam;

    @ManyToOne
    @JoinColumn(name = "nguoisohuu")
    private KhachHang nguoiSoHuu;

}
