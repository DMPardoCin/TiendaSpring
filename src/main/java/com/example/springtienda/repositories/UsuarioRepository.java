package com.example.springtienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtienda.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}
