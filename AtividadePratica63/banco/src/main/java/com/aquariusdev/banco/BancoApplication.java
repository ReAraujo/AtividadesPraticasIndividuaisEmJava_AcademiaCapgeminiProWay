/* _  Utilize o projeto criado durante a atividade ATP62.
   _  Crie uma nova model de Agência. Adicione os atributos que julgar relevantes
   _  Crie uma nova repository para o model de Agência.
   _  Teste as operações de CRUD da repository na classe principal da aplicação.
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
