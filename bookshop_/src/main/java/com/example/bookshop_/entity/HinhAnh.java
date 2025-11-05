package com.example.bookshop_.entity;

import lombok.Data;
import java.sql.Blob;

@Data
public class HinhAnh {

    private int maHinhAnh;

    private String tenHinhAnh;

    private boolean laIcon;

    private String duongDan;

    private String duLieuAnh;

    private Sach sach;
}
