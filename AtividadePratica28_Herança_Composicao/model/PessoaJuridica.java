package model;

public class PessoaJuridica extends Pessoa {
    public String nomeFantasia;
    public String cnpj;
    public String numeroInscricaoEstadual;

    @Override
    public String toString() {
        String retorno4 =   "\n| Nome fantasia: " + this.nomeFantasia + 
                            "\n| CNPJ: " + this.cnpj +
                            "\n| Número da Inscrição Estadual: " + this.numeroInscricaoEstadual;
        return retorno4 + super.toString();
    }

}
