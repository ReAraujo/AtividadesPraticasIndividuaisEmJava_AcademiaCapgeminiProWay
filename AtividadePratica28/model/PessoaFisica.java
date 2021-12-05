package AtividadePratica28_Herança_Composicao.model;

public class PessoaFisica extends Pessoa {
    public String nomeCompleto;
    public String cpf;
    public String rg;
    public String dataNascimento;

    public PessoaFisica() {
        super();
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        String retorno3 =   "\n| Nome completo: " + this.nomeCompleto + 
                            "\n| CPF: " + this.cpf +
                            "\n| RG: " + this.rg + 
                            "\n| Data de nascimento: " + this.dataNascimento;
        return retorno3 + super.toString();
    }

}