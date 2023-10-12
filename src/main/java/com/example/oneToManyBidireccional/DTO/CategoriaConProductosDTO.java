package com.example.oneToManyBidireccional.DTO;

import com.example.oneToManyBidireccional.entity.Producto;

import java.util.List;

public class CategoriaConProductosDTO {
    private Long id;
    private String nombre;
    private List<Producto> productos;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}