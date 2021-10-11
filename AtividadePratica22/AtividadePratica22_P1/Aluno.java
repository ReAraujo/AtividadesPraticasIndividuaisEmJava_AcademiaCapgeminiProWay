/* - Crie uma classe Aluno com os atributos privados nome completo, idade e matricula.
   - Crie os métodos getters e setters para cada atributo da classe Aluno.
   - Crie o métodos toString na classe Aluno, fazendo um override no método padrão da classe Object.
*/

package AtividadePratica22.AtividadePratica22_P1;

public class Aluno {
    private String nome_completo;
    private int idade;
    private String matricula;

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getNome_completo() {
        return this.nome_completo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString(){
        String mensagem = "Informações do(a) aluno(a):\nNome completo: " + this.nome_completo + "\n" +  "Idade: " + this.idade + "\n" +
            "Matrícula: " + this.matricula + "\n";
        return mensagem;
    }


    
}
