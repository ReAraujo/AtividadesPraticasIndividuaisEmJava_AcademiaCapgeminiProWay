/* _  Utilize o projeto criado durante a atividade ATP62.
   _  Crie uma nova model de Agência. Adicione os atributos que julgar relevantes
   _  Crie uma nova repository para o model de Agência.
   _  Teste as operações de CRUD da repository na classe principal da aplicação.
*/

package com.aquariusdev.banco;

import com.aquariusdev.banco.model.Agencia;
import com.aquariusdev.banco.model.Clientes;
import com.aquariusdev.banco.repository.AgenciaRepository;
import com.aquariusdev.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	// Como ClienteRepository não é uma classe e sim uma interface, não é possível criar um new ClienteRepository 
	// então ela poderá ser adicionada como propriedade da classe:
	private ClienteRepository clienteRepository; 
	private AgenciaRepository agenciaRepository;

	// Após, cria-se um construtor da classe e nele é adicionado que deseja que receba uma instância de ClienteRepository
	// que então a framework Springboot irá startar e criar a instância. Esse processo é chamado de:
	// Injeção de Dependências (sendo então: criar uma instância da implementação da interface)
	public BancoApplication(ClienteRepository clienteRepository, AgenciaRepository agenciaRepository) {
		this.clienteRepository = clienteRepository;
		this.agenciaRepository = agenciaRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Clientes modelCliente = new Clientes();
		modelCliente.setId(1);
		modelCliente.setNomeCompleto("Pessoa Cliente 2");
		modelCliente.setIdade(40);

		// CRUD de Clientes:
		// o save servirá para as operações de create e update - para utilizar para update
		// somente é preciso informar o id em model.setId(x) sendo x = id a ser atualizado

		//clienteRepository.save(model); // salvando no DB
		//clienteRepository.save(model); // atualizando no BD
		//clienteRepository.deleteById(1); // deletando no DB

		// lendo do BD:
		clienteRepository.findAll().forEach(c -> System.out.printf("ID: %d |Nome Completo: %s | Idade: %d anos \n", 
						c.getId(), c.getNomeCompleto(), c.getIdade()));
		// .findAll() = retorna uma lista genérica
		// .forEach() = para cada elemento da lista (c) faça isso -> impressão em console utilizando o sysout


		Agencia modelAgencia = new Agencia();
		modelAgencia.setId(1);
		modelAgencia.setAgencia("1054-8");
		modelAgencia.setNumeroCC("100200-30");

		// CRUD de Agencia:

		//agenciaRepository.save(modelAgencia); // salvando no DB
		//agenciaRepository.save(modelAgencia); // atualizando no BD
		// agenciaRepository.deleteById(1); // deletando no DB

		// lendo do BD:
		agenciaRepository.findAll().forEach(ag -> System.out.printf("ID: %d | Agência: %s | Conta Corrente: %d",
						ag.getId(), ag.getAgencia(), ag.getNumeroCC()));
	}

}
