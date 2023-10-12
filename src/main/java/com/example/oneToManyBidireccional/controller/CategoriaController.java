package com.example.oneToManyBidireccional.controller;

import com.example.oneToManyBidireccional.DTO.CategoriaConProductosDTO;
import com.example.oneToManyBidireccional.entity.Categoria;
import com.example.oneToManyBidireccional.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaService.obtenerTodasLasCategorias();
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.crearCategoria(categoria);
    }
    @GetMapping("/{id}")
    public CategoriaConProductosDTO obtenerCategoriaConProductos(@PathVariable Long id) {
        return categoriaService.obtenerCategoriaConProductos(id);
    }
}
