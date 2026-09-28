package com.example.springtienda.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data //implementa getters y setters
@Entity 
public class Producto extends BaseEntity{
    
    private String nombre;
    private Double precio;

    @ManyToOne //relacion muchos a uno
    private Usuario usuario;

    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
