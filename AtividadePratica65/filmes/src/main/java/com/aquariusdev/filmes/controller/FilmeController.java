package com.aquariusdev.filmes.controller;

import java.util.List;

import com.aquariusdev.filmes.model.Filme;
import com.aquariusdev.filmes.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// Anotação @Controller = mapeia que essa classe é uma controller de requisições 
// então as requisições serão mapeadas aqui
public class FilmeController {
    // Encapsulamento: 
    private FilmeRepository repository;

    // Método construtor via injeção de dependências que está aguardando uma instância de ClienteRepository:
    public FilmeController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/filme") // Mapeando requisição tipo 'get' para a rota "/filme" - tipo 'get' mostra os parâmetros inseridos na url
    public String filmes(Model req){
        List<Filme> lista = (List<Filme>)repository.findAll();
        req.addAttribute("filme", lista);
        return "filmes"; // Retorna o HTML 'filmes'
    }

    @GetMapping("/filme/form")
    public String formulario(Model req){
        Filme model = new Filme();
        req.addAttribute("filme", model);
        return "filmes-form";
    }

    @PostMapping("/filme/salvar") // Mapeando requisição tipo 'post' para rota "/filme/salvar" - tipo 'post' = mantem as informações ocultas na url
    public String salvar(Filme model){
        repository.save(model);
        return "redirect:/filme";
    }

    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Filme model = repository.findById(id).get(); // .get() = submétodo para converter 
        req.addAttribute("filme", model);
        return "filmes-form";
    }

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/filme";
    }


}
