package com.aquariusdev.filmes.controller;

import java.util.List;

import com.aquariusdev.filmes.model.Cliente;
import com.aquariusdev.filmes.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// Anotação @Controller = mapeia que essa classe é uma controller de requisições 
// então as requisições serão mapeadas aqui
public class ClienteController {
    // Encapsulamento: 
    private ClienteRepository repository;

    // Método construtor via injeção de dependências que está aguardando uma instância de FilmeRepository:
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cliente") // Mapeando requisição tipo 'get' para a rota "/filme" - tipo 'get' mostra os parâmetros inseridos na url
    public String filmes(Model req){
        List<Cliente> lista = (List<Cliente>)repository.findAll();
        req.addAttribute("cliente", lista);
        return "clientes"; // Retorna o HTML 'clientes'
    }

    @GetMapping("/cliente/form")
    public String formulario(Model req){
        Cliente model = new Cliente();
        req.addAttribute("cliente", model);
        return "clientes-form";
    }

    @PostMapping("/cliente/salvar") // Mapeando requisição tipo 'post' para rota "/filme/salvar" - tipo 'post' = mantem as informações ocultas na url
    public String salvar(Cliente model){
        repository.save(model);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Cliente model = repository.findById(id).get(); // .get() = submétodo para converter 
        req.addAttribute("cliente", model);
        return "clientes-form";
    }

    @GetMapping("/cliente/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/cliente";
    }


}
