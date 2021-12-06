package com.aquariusdev.filmes.repository;

import com.aquariusdev.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer>{
    
}
