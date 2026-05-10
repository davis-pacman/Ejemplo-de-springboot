package com.example.mvc_crud_ventas.serviceImpl;

import com.example.mvc_crud_ventas.model.Categoria;
import com.example.mvc_crud_ventas.repository.CategoriaRepository;
import com.example.mvc_crud_ventas.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> read(Long aLong) {
        return categoriaRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        categoriaRepository.deleteById(aLong);
    }

    @Override
    public List<Categoria> readAll() {
        return categoriaRepository.findAll();
    }
}
