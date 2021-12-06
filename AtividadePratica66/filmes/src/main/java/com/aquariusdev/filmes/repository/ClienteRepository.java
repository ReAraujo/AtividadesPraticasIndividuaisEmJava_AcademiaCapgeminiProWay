package com.aquariusdev.filmes.repository;

import com.aquariusdev.filmes.model.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
