package com.example.bookshop_.dao;

import com.example.bookshop_.entity.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path = "sach")
public interface SachRepository extends JpaRepository<Sach, Integer> {
    Page<Sach> findByTenSachContaining(@RequestParam("tenSach") String tenSach, Pageable pageable);
    Page<Sach> findByTheLoai_MaTheLoai(@RequestParam("maTheLoai") String tenSach, Pageable pageable);
    Page<Sach> findByTenSachContainingAndTheLoai_MaTheLoai(@RequestParam("tenSach") String tenSach,@RequestParam("maTheLoai") String maTheLoai, Pageable pageable);
}
