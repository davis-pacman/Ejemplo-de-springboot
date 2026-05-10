package com.example.mvc_crud_ventas.repository;

import com.example.mvc_crud_ventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
