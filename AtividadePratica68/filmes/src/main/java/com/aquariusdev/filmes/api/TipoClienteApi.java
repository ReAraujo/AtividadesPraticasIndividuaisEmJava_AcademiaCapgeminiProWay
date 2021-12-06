package com.aquariusdev.filmes.api;

import java.util.List;

import com.aquariusdev.filmes.model.TipoCliente;
import com.aquariusdev.filmes.repository.TipoClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação @RestController = responde e recebe no formato JSON
@RequestMapping("/api/tipocliente")
public class TipoClienteApi {
    @Autowired // Anotação @Autowired = ao invés de ter o método construtor para fazer a injeção de dependências, basta ter essa anotação
    private TipoClienteRepository tipoRepository;

    @GetMapping 
    public List<TipoCliente> tipoClientes(String nome){
        return (List<TipoCliente>)tipoRepository.findAll(); 
    }

    @PostMapping
    public String salvar(@RequestBody TipoCliente model){ 
        tipoRepository.save(model);
        return "O cadastro do tipo de cliente foi salvo com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id){ 
        tipoRepository.deleteById(id);
        return "O cadastro do tipo de cliente foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public String update(@RequestBody TipoCliente model, @PathVariable int id){
        if(id == model.getId()){
            tipoRepository.save(model);
            return "O cadastro do tipo de cliente foi atualizado com sucesso!";
        }
        return "Desculpe-me, não foi possível localizar esse valor de ID.";
    }   
}
