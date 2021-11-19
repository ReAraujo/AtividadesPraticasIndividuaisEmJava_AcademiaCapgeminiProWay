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

    Endereco end1 = new Endereco();
    end1.cep = "56.604-78";
    end1.logradouro = "Rua da Ciclana";
    end1.numero = "107";
    end1.complemento = "Apartamento A-405";
    end1.bairro = "Bairro da Ciclana";
    end1.cidade = "Cidadolândia";
    end1.estado = "Estadolândia";
    end1.pais = "Paisolândia";

    PessoaFisica pf2 = new PessoaFisica();
    pf2.id = 0001;
    pf2.nomeCompleto = "Fulana de Ciclana";
    pf2.cpf = "123.456.789-89";
    pf1.rg = "5524019612";
    pf1.dataNascimento = "07/07/1980";

    Endereco end3 = new Endereco();
    end3.cep = "56.604-78";
    end3.logradouro = "Rua da Ciclana";
    end3.numero = "107";
    end3.complemento = "Apartamento A-405";
    end3.bairro = "Bairro da Ciclana";
    end3.cidade = "Cidadolândia";
    end3.estado = "Estadolândia";
    end3.pais = "Paisolândia";

    PessoaJuridica pj1 = new PessoaJuridica();
    pj1.id = 0002;
    pj1.nomeFantasia = "Mia's Company";
    pj1.cnpj = "20.300.400/0001-01";
    pj1.numeroInscricaoEstadual = ""; 

    Endereco end2 = new Endereco();
    end2.cep = "78.526-74";
    end2.logradouro = "Rua das Empresas Lucrativas";
    end2.numero = "4563";
    end2.complemento = "Torre A - Loja 1105";
    end2.bairro = "Das Flores";
    end2.cidade = "Porto Alegre";
    end2.estado = "Rio Grande do Sul";
    end2.pais = "Brasil";

    
    pf1.enderecoResidencial = end1;

    pj1.enderecoComercial = end2;

    pessoaFisicaController.create(pf1);
    pessoaFisicaController.create(pf2);    
    pessoaJuridicaController.create(pj1);

    System.out.println(pessoaFisicaController.read());
    System.out.println(pessoaJuridicaController.read());  
  }
    
}
