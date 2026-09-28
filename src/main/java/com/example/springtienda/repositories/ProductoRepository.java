package com.example.springtienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtienda.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
