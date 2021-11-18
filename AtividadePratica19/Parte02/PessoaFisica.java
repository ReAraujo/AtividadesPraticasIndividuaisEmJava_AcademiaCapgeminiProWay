/* - Crie uma classe Pessoa Física com os atributos código, nome, sobrenome, idade, rg e cpf.
   - Todos os atributos da classe Pessoa Física devem ser privados.
   - Construa os métodos get e set para cada um dos atributos da classe.
*/

package AtividadePratica19.Parte02;

public class PessoaFisica {
    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRg() {
        return this.rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}
