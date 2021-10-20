/* _  Crie um sistema de cadastro de Filmes e Séries.
   _  O sistema deve utilizar o padrão de arquitetura MVC
   _  Os modelos devem possuir um id e outros atributos públicos de sua escolha.
   _  As controllers devem possuir os quatro métodos de CRUD e deve utilizar um 
      ArrayList privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
   _  A view deve testar as operações de CRUD para cada controller 
      (Utilize dados fixo, sem entrada do usuário).
*/
package view;

import controller.FilmeController;
import controller.SerieController;
import model.Filme;
import model.Serie;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos das Classes Controllers
        FilmeController filmeController = new FilmeController();
        SerieController serieController = new SerieController();
        
        // Criação dos objetos das Classes Model e adição dos dados aos atributos dos objetos
        Filme filme1 = new Filme();
        filme1.id = "0001";
        filme1.titulo = "Forrest Gump";
        filme1.diretor = "Robert Zemeckis";
        filme1.anoLancamento = 1994;
        filme1.genero = "Comédia dramática";

        Filme filme2 = new Filme();
        filme2.id = "0002";
        filme2.titulo = "Tempos Modernos";
        filme2.diretor = "Charlie Chaplin";
        filme2.anoLancamento = 1936;
        filme2.genero = "Comédia - Drama - Romance";

        Filme filme3 = new Filme();
        filme3.id = "0002";
        filme3.titulo = "Vanilla Sky";
        filme3.diretor = "Cameron Crowe";
        filme3.anoLancamento = 2002;
        filme3.genero = "Drama romântico";

        Serie serie1 =  new Serie();
        serie1.id = "0003";
        serie1.titulo = "Grey's Anatomy";
        serie1.diretor = "Shonda Rhimes";
        serie1.anoLancamento = 2005;
        serie1.genero = "Drama médico";
        serie1.emissora = "Rede ABC";
        serie1.quantidadeDeTemporadas = 18;
        serie1.quantidadeDeEpisodios = 381;

        Serie serie2 =  new Serie();
        serie2.id = "0004";
        serie2.titulo = "Gilmore Girls";
        serie2.diretor = "Amy Sherman-Palladino";
        serie2.anoLancamento = 2000;
        serie2.genero = "Comédia dramática";
        serie2.emissora = "The WB";
        serie2.quantidadeDeTemporadas = 7;
        serie2.quantidadeDeEpisodios = 153;

        // Criando os objetos na lista 
        filmeController.create(filme1);
        filmeController.create(filme2);
        filmeController.create(filme3);
        serieController.create(serie1);
        serieController.create(serie2);

        // Imprimindo os objetos adicionados a lista
        System.out.println("==================== Filmes ====================");
        System.out.println(filmeController.read());

        System.out.println("==================== Séries ====================");
        System.out.println(serieController.read());

        // Deletando os objetos filme2 e serie2 para verificar o método delete 
        filmeController.delete(filme2);
        serieController.delete(serie2);

        // Utilizando o método update para identificar os objetos com o mesmo ID e deletar 
        filmeController.update(filme3);

        // Imprimindo novamente os objetos para verificar o método delete 
        System.out.println("-------------------- Filmes --------------------");
        System.out.println(filmeController.read());

        System.out.println("-------------------- Séries --------------------");
        System.out.println(serieController.read());











    }
    
}
