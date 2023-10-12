package com.example.oneToManyBidireccional.service;

import com.example.oneToManyBidireccional.DTO.CategoriaConProductosDTO;
import com.example.oneToManyBidireccional.entity.Categoria;
import com.example.oneToManyBidireccional.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public CategoriaConProductosDTO obtenerCategoriaConProductos(Long id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Categoría no encontrada con ID: " + id));

        CategoriaConProductosDTO categoriaConProductosDTO = new CategoriaConProductosDTO();
        categoriaConProductosDTO.setId(categoria.getId());
        categoriaConProductosDTO.setNombre(categoria.getNombre());
        categoriaConProductosDTO.setProductos(categoria.getProductos());

        return categoriaConProductosDTO;
    }
}
