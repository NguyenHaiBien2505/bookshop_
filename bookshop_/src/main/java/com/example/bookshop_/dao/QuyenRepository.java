package com.example.bookshop_.dao;

import com.example.bookshop_.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuyenRepository extends JpaRepository<NguoiDung, Integer> {
}
