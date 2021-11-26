package com.aquariusdev.banco.repository;

import com.aquariusdev.banco.model.Clientes;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes, Integer>{
    
}
