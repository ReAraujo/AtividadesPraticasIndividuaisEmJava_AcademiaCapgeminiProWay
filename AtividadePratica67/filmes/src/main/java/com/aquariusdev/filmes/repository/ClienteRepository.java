/* _  Utilize como base o código gerado na ATP66.
   _  Modifique o método de listagem de clientes para que retorne todos os clientes ordenados por id em ordem crescente.
   _  Altere o método de listagem de clientes para que seja possivel filtrar os clientes pelo nome.
*/

package com.aquariusdev.filmes.repository;

import java.util.List;

import com.aquariusdev.filmes.model.Cliente;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer>{

    // Classe de ponto comum de WEB e API (controller e API), por isso cria-se aqui os métodos de listagem:

    // Modifique o método de listagem de clientes para que retorne todos os clientes ordenados por id em ordem crescente:
    // ordenando por ID:
    @Override
    default Iterable<Cliente> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    // extensão da interface PagingAndSortingRepositorypara poder paginar e ordenar os dados - ela extende de CrudRepository<T, ID>
    // classe Sort.by = .by = pelo o que deseja ordenar 
    // dois parâmetros: como quer ordenar (Sort.Direction.ASC)(ASC do menor para o maior) e por qual coluna quer ordenar ("id")

    // Altere o método de listagem de clientes para que seja possivel filtrar os clientes pelo nome:
    List<Cliente> findByNomeCompleto(String nome);
    // o JPA faz automático a busca quando usa-se o find + nome da propriedade
   
}
