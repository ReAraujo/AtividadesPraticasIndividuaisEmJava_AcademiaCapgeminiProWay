/* _  Crie um sistema de cadastro de Pessoa Física e Pessoa Jurídica.
  _  Tanto Pessoa Física como Pessoa Jurídica devem possuir Endereço.
  _  O sistema deve utilizar o padrão de arquitetura MVC
  _  Os modelos devem possuir um id e outros atributos públicos de sua escolha.
  _  As controllers devem possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
  _  A view deve testar as operações de CRUD para cada controller (Utilize dados fixo, sem entrada do usuário).
*/

package AtividadePratica28_Herança_Composicao.view;

import AtividadePratica28_Herança_Composicao.controller.PessoaFisicaController;
import AtividadePratica28_Herança_Composicao.controller.PessoaJuridicaController;
import AtividadePratica28_Herança_Composicao.model.Endereco;
import AtividadePratica28_Herança_Composicao.model.PessoaFisica;
import AtividadePratica28_Herança_Composicao.model.PessoaJuridica;

public class Main {
  public static void main(String[] args) {
    PessoaFisicaController pessoaFisicaController = new PessoaFisicaController();
    PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController();

    PessoaFisica pf1 = new PessoaFisica();
    pf1.id = 0001;
    pf1.nomeCompleto = "Fulana de Ciclana";
    pf1.cpf = "123.456.789-89";
    pf1.rg = "5524019612";
    pf1.dataNascimento = "07/07/1980";
    pf1.cep = "56.604-78";
    pf1.logradouro = "Rua da Ciclana";
    pf1.numero = "107";
    pf1.complemento = "Apartamento A-405";
    pf1.bairro = "Bairro da Ciclana";
    pf1.cidade = "Cidadolândia";
    pf1.estado = "Estadolândia";
    pf1.pais = "Paisolândia";

    PessoaJuridica pj1 = new PessoaJuridica();
    pj1.id = 0002;
    pj1.nomeFantasia = "Mia's Company";
    pj1.cnpj = "20.300.400/0001-01";
    pj1.numeroInscricaoEstadual = ""; 
    pj1.cep = "78.526-74";
    pj1.logradouro = "Rua das Empresas Lucrativas";
    pj1.numero = "4563";
    pj1.complemento = "Torre A - Loja 1105";
    pj1.bairro = "Das Flores";
    pj1.cidade = "Porto Alegre";
    pj1.estado = "Rio Grande do Sul";
    pj1.pais = "Brasil";

    // Criando:
    pessoaFisicaController.create(pf1);   
    pessoaJuridicaController.create(pj1);

    // Lendo:
    System.out.println(pessoaFisicaController.read());
    System.out.println(pessoaJuridicaController.read());  

    // Deletando:
    pessoaFisicaController.delete(pf1); 

    System.out.println(pessoaFisicaController.read());

    // Alterando:
    pf1.id = 0001;
    pf1.nomeCompleto = "Ciclana";
    pf1.cpf = "111.222.333-44";
    pf1.rg = "5524019612";
    pf1.dataNascimento = "01/01/1901";
    pf1.cep = "11.222-33";
    pf1.logradouro = "Rua da Ciclana";
    pf1.numero = "107";
    pf1.complemento = "Apartamento A-405";
    pf1.bairro = "Bairro da Ciclana";
    pf1.cidade = "Cidadolândia";
    pf1.estado = "Estadolândia";
    pf1.pais = "Paisolândia";

    pessoaFisicaController.update(pf1); 

    // Lendo:
    System.out.println(pessoaFisicaController.read());


  }
    
}
