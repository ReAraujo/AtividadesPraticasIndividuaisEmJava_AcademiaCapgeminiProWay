package com.aquariusdev.filmes.api;

import java.util.List;

import com.aquariusdev.filmes.model.Cliente;
import com.aquariusdev.filmes.repository.ClienteRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação @RestController = responde e recebe no formato JSON
public class ClienteApi {
    private ClienteRepository repository;

    // Método construtor via injeção de dependências que está aguardando uma instância de ClienteRepository:
    public ClienteApi(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/cliente") 
    public List<Cliente> clientes(){
        List<Cliente> lista = (List<Cliente>)repository.findAll();
        return lista; 
    }
    
}
