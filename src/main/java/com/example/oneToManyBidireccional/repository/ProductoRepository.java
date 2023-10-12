package com.example.oneToManyBidireccional.repository;

import com.example.oneToManyBidireccional.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}