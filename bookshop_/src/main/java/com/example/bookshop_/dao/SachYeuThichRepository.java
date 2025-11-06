package com.example.bookshop_.dao;

import com.example.bookshop_.entity.SachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "sach-yeu-thich")
public interface SachYeuThichRepository extends JpaRepository<SachYeuThich, Integer> {
}
