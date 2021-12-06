package com.aquariusdev.filmes.api;

import java.util.List;

import com.aquariusdev.filmes.model.Cliente;
import com.aquariusdev.filmes.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação @RestController = responde e recebe no formato JSON
public class ClienteApi {
    @Autowired // Anotação @Autowired = ao invés de ter o método construtor para fazer a injeção de dependências, basta ter essa anotação
    private ClienteRepository repository;

    @GetMapping("/api/cliente") 
    public List<Cliente> clientes(){
        List<Cliente> lista = (List<Cliente>)repository.findAll();
        return lista; 
    }

    @PostMapping("/api/cliente")
    public String salvar(@RequestBody Cliente model){ // Anotação @RequestBody = Cliente está vindo do corpo da requisição
        repository.save(model);
        return "O cadastro do cliente foi salvo com sucesso!";
    }

    @DeleteMapping("/api/cliente/{id}")
    public String deletar(@PathVariable int id){ 
        repository.deleteById(id);
        return "O cadastro do cliente foi deletado com sucesso!";
    }

    @PutMapping("/api/cliente/{id}")
    public String update(@RequestBody Cliente model, @PathVariable int id){
        // validação se o mesmo ID que foi enviado na requisição da url seja o mesmo do model:
        if(model.getId() == id){
            repository.save(model);
            return "O cadastro do cliente foi atualizado com sucesso!";
        }
        return "Desculpe-me, não foi possível localizar esse valor de ID.";
    }

    
}
