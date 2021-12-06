/* _  Utilize como base o código gerado na ATP64.
   _  Adicione a dependencia do lombok no pom.xml, realize o clean e install do maven.
   _  Ajuste as classes de modelo para utilizarem as anotações de getters e setters do lombok.
   _  Adicione o plugin para VS Code do lombok (Lombok Annotations Support for VS Code)
   _  Teste o projeto para verificar se tudo continua funcionando corretamente com as alterações do lombok.
   _  Crie um template para ser usado como base para outros templates.
   _  Crie um fragment para o head do html, nele importe um css local e o css do bootstrap. O fragment deve receber como parâmetro o título da página.
   _  Crie um fragment para o header da página e nele crie um cabeçalho do bootstrap.
   _  Utilize os dois fragments nos demais templates.
   _  Ajuste a tela de listagem de clientes para utilizar o estilo do bootstrap.
   _  Ajuste a tela de cadastro e edição de clientes para utilizar o estilo do bootstrap.
*/


package com.aquariusdev.filmes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity // Informando que é uma entidade de tabela do DB
@Table(name = "cliente") // Informando que a tabela possui nome "filme"
public class Cliente {
    // Encapsulamento:
    // Anotações @Getter @Setter = Métodos getters (métodos de acesso) e setters (métodos de modificação) inicializados pelo Lombok
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna 'id' é auto gerada no padrão 'Identity'
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String nomeCompleto;

    @Getter @Setter
    private String dataNascimento;

    @Getter @Setter
    private String cpf;
}
