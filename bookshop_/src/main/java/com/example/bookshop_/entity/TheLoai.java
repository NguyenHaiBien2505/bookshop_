package com.example.bookshop_.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class TheLoai {

    private int maTheLoai;

    private String tenTheLoai;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH})
    @JoinTable(
            name = "sach_danhsachtheloai",
            joinColumns = @JoinColumn(name = "ma_the_loai"),
            inverseJoinColumns = @JoinColumn(name = "ma_sach")
    )
    private List<Sach> danhSachQuyenSach;
}
