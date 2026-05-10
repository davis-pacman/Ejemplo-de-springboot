package com.example.mvc_crud_ventas.repository;

import com.example.mvc_crud_ventas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
