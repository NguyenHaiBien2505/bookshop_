package com.example.bookshop_.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class SachYeuThich {

    private int maSachYeuThich;

    private NguoiDung nguoiDung;

    private Sach sach;

}