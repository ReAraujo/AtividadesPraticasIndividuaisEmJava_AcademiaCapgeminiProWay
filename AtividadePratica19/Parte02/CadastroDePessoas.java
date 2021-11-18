/* - Crie uma classe Cadastro de Pessoas que contenha um método main.
   - Nesta classe, crie um array de Pessoa com 5 posições.
   - Crie 5 objetos da classe pessoa, chame os método set para atribuir 
     valores diferente para cada pessoa e salve cada objeto em uma posição do array.
   - Imprima todos os dados das 5 pessoas utilizando o laço de repetição foreach.
*/
package AtividadePratica19.Parte02;

public class CadastroDePessoas {
    public static void main(String[] args) {
        PessoaFisica[] pessoa = new PessoaFisica[5];

        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setCodigo(1111);
        pessoa1.setNome("Juliana");
        pessoa1.setSobrenome("Almeida");
        pessoa1.setIdade(20);
        pessoa1.setRg("4556321585");
        pessoa1.setCpf("123.456.789-78");

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setCodigo(1112);
        pessoa2.setNome("Dirceu");
        pessoa2.setSobrenome("Silveira");
        pessoa2.setIdade(50);
        pessoa2.setRg("1461053298");
        pessoa2.setCpf("789.456.123-41");

        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setCodigo(1113);
        pessoa3.setNome("Helena");
        pessoa3.setSobrenome("de Tróia");
        pessoa3.setIdade(35);
        pessoa3.setRg("5954163585");
        pessoa3.setCpf("741.852.963-25");

        PessoaFisica pessoa4 = new PessoaFisica();
        pessoa4.setCodigo(1114);
        pessoa4.setNome("Carlos");
        pessoa4.setSobrenome("da Silva");
        pessoa4.setIdade(81);
        pessoa4.setRg("8541746523");
        pessoa4.setCpf("963.852.741-21");

        PessoaFisica pessoa5 = new PessoaFisica();
        pessoa5.setCodigo(1115);
        pessoa5.setNome("Juvêncio");
        pessoa5.setSobrenome("Soares");
        pessoa5.setIdade(46);
        pessoa5.setRg("4521693256");
        pessoa5.setCpf("987.654.321-03");

        pessoa[0] = pessoa1;
        pessoa[1] = pessoa2;
        pessoa[2] = pessoa3;
        pessoa[3] = pessoa4;
        pessoa[4] = pessoa5;

        for (PessoaFisica pessoaFisica : pessoa) {
            System.out.printf("\nCódigo: %d", pessoaFisica.getCodigo());
            System.out.printf("\nNome: %s", pessoaFisica.getNome());
            System.out.printf("\nSobrenome: %s", pessoaFisica.getSobrenome());
            System.out.printf("\nIdade: %d anos", pessoaFisica.getIdade());
            System.out.printf("\nRG: %s", pessoaFisica.getRg());
            System.out.printf("\nCPF: %s", pessoaFisica.getCpf());
            System.out.println();
        }

    }
    
}
