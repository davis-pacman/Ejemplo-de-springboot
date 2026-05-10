package com.example.mvc_crud_ventas.controller;

import com.example.mvc_crud_ventas.model.Categoria;
import com.example.mvc_crud_ventas.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cats",categoriaService.readAll());
        model.addAttribute("categoria", new Categoria());
        return "categorias/cats";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Categoria categoria, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("cats",categoriaService.readAll());
        }
        categoriaService.create(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id, Model model) {
        categoriaService.delete(id);
        return "redirect:/categorias";
    }
}
