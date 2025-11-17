package com.example.bookshop_.service;


import com.example.bookshop_.entity.NguoiDung;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public NguoiDung  findByUsername(String tenDangNhap);
}
