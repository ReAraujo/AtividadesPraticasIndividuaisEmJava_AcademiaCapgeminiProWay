/* _  Acesse o site de criação de projetos spring no endereço:  https://start.spring.io/ .
   _  Crie um projeto com as dependências do Spring JPA e o Driver do Postgres.
   _  Gere o projeto, descompacte a pasta e cole em repositório GIT. 
   _  Adicione as configurações de banco de dados no arquivo resources
   _  Execute os comandos clean e install do maven.
   _  Teste a aplicação executando a classe java que já veio com o do projeto.
   _  Crie uma camada model e adicione a classe model de Clientes. Crie as propriedades que julgar necessário.
   _  Crie uma camada repository e adicione a interface ClienteRepository que herda de CrudRepository.
   _  Realize os testes da repository na classe principal da aplicação. Lembre-se de utilizar a injeção de dependências para criação da instância da interface repository.
*/

package com.aquariusdev.banco;

import com.aquariusdev.banco.model.Clientes;
import com.aquariusdev.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	// Como ClienteRepository não é uma classe e sim uma interface, não é possível criar um new ClienteRepository 
	// então ela poderá ser adicionada como propriedade da classe:
	private ClienteRepository repository; 

	// Após, cria-se um construtor da classe e nele é adicionado que deseja que receba uma instância de ClienteRepository
	// que então a framework Springboot irá startar e criar a instância. Esse processo é chamado de:
	// Injeção de Dependências (sendo então: criar uma instância da implementação da interface)
	public BancoApplication(ClienteRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Clientes model = new Clientes();
		model.setId(1);
		model.setNomeCompleto("Pessoa Cliente 2");
		model.setIdade(40);

		// Operações de CRUD:
		//repository.save(model); // create
		//repository.deleteById(1); // delete
		
		// o save servirá para as operações de create e update - para utilizar para update
		// somente é preciso informar o id em model.setId(x) sendo x = id a ser atualizado
		repository.save(model);

		repository.findAll().forEach(c -> System.out.printf("Nome Completo: %s | Idade: %d anos \n", 
						c.getNomeCompleto(), c.getIdade()));
		// .findAll() = retorna uma lista genérica
		// .forEach() = para cada elemento da lista (c) faça isso -> impressão em console utilizando o sysout
		
	}

}
