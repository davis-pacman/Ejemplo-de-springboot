package com.example.mvc_crud_ventas.serviceImpl;

import com.example.mvc_crud_ventas.model.Producto;
import com.example.mvc_crud_ventas.repository.ProductoRepository;
import com.example.mvc_crud_ventas.service.ProductoService;

import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> read(Long aLong) {
        return productoRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        productoRepository.deleteById(aLong);
    }

    @Override
    public List<Producto> readAll() {
        return productoRepository.findAll();
    }
}
