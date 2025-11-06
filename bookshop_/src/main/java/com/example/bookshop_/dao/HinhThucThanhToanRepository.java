package com.example.bookshop_.dao;

import com.example.bookshop_.entity.HinhThucGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HinhThucThanhToanRepository extends JpaRepository<HinhThucGiaoHang, Integer> {
}
