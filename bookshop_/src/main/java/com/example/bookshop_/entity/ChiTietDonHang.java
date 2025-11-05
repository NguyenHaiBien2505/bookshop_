package com.example.bookshop_.entity;

import lombok.Data;

@Data

public class ChiTietDonHang {

    private long chiTietDonHang;

    private int soLuong;

    private double giaBan;

    private Sach sach;

    private DonHang donHang;
}