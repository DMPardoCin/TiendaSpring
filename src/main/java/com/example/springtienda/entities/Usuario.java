package com.example.springtienda.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data //implementa getters y setters
@Entity 
public class Usuario extends BaseEntity {
    
    private String nombre;
    private String email;
    private String telefono;

    @OneToMany(mappedBy="usuario" ,fetch = FetchType.EAGER)  //relacion uno a muchos
    private List<Producto> productos=new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
}
