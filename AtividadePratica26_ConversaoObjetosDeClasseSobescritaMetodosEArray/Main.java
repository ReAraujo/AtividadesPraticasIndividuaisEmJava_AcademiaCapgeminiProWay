/*_  Crie uma classe Pessoa com os atributos públicos: nome, sobrenome e idade. - OK!
  _  Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos: matricula, turma e curso.  - OK!
  _  Crie uma sobrescrita do método equals nas duas classes para comparar os dados especificos de cada uma.  - OK!
  _  Crie uma sobrescrita do método toString nas duas classes para imprimir todos os dados. - OK!
  _  Crie uma classe Dados com um atributo privado do tipo array de Object. - OK!
  _  Crie uma inicialização do array para 5 posições dentro do do método construtor da classe.  - OK!
  _  Crie um método para adicionar elementos ao array e que permita receber tanto objetos da classe pessoa 
     quanto objetos da classe Aluno. Caso o array já tenha todas as posições ocupadas, deve ser adicionado 
     mais 5 posições ao array. - OK!
  _  Crie um método para mostrar quantos elementos já foram adicionados ao array. - OK!
  _  Crie um método para remover um elemento do array. - OK!
  _  Crie um método para verificar se um determinado objeto já foi salvo no array. - OK!
  _  Crie uma classe Main com um método main, neste método, crie um objeto da classe Pessoa, um da classe Aluno e 
     atribua valores para as propriedade de cada objeto. - OK!
  _  Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array. - OK
  _  Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente. - OK
  _  Verifique se o segundo objeto de pessoa já está salvo no array,utilizando o método da classe Dados. - OK
  _  Remova o aluno do array, utilizando o método da classe Dados. - OK
*/
public class Main {
    public static void main(String[] args) {
            
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulana";
        pessoa1.sobrenome = "de Ciclana";
        pessoa1.idade = "38";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Luana";
        aluno1.sobrenome = "Pereira";
        aluno1.idade = "24";
        aluno1.matricula = "452368";
        aluno1.turma = "Q.326";
        aluno1.curso = "Bacharel em Química";

        Dados dados = new Dados();
        dados.adicionar(pessoa1);
        dados.adicionar(aluno1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Fulana";
        pessoa2.sobrenome = "de Ciclana";
        pessoa2.idade = "38";

        System.out.println(dados.contains(pessoa2));

        dados.remover(pessoa2);







    }

    
}
