/* _  Utilize como base o código gerado na ATP66.
   _  Modifique o método de listagem de clientes para que retorne todos os clientes ordenados por id em ordem crescente.
   _  Altere o método de listagem de clientes para que seja possivel filtrar os clientes pelo nome.
*/

package com.aquariusdev.filmes.repository;

import com.aquariusdev.filmes.model.TipoCliente;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TipoClienteRepository extends PagingAndSortingRepository<TipoCliente, Integer>{
   
}
