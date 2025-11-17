package com.example.bookshop_.dao;

import com.example.bookshop_.entity.NguoiDung;
import com.example.bookshop_.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "quyen")
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {

    public Quyen findByTenQuyen(String tenQuyen);
}
