package com.example.bookshop_.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Blob;

@Entity
@Table(name = "hinh_anh")
@Data
public class HinhAnh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private int maHinhAnh;
    @Column(name = "ten_hinh_anh")
    private String tenHinhAnh;
    @Column(name = "la_icon")
    private boolean laIcon;
    @Column(name = "duong_dan")
    @Lob // du lieu lon
    private String duongDan;
    @Column(name = "du_lieu_anh",columnDefinition = "LONGTEXT")
    private String duLieuAnh;
    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH})
    @JoinColumn(name = "ma_sach", nullable = false)
    private Sach sach;
}
