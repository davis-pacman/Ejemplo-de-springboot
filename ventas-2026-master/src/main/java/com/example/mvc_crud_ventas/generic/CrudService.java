package com.example.mvc_crud_ventas.generic;

import java.util.List;
import java.util.Optional;

public interface CrudService<T,ID> {
    T create(T t);
    T update(T t);
    Optional<T> read(ID id);
    void delete(ID id);
    List<T> readAll();
}
