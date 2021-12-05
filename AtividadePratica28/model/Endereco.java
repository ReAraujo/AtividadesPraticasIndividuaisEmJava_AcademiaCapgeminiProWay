package AtividadePratica28_Herança_Composicao.model;

public class Endereco{
    public String cep;
    public String logradouro;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String pais;


    
    @Override
    public String toString() {
        String retorno2 =   "\n| CEP: " + this.cep + 
                            "\n| Logradouro: " + this.logradouro +" " +  "Numero: " + this.numero + " " + "Completo: " + this.complemento + 
                            "\n| Complemento: " + this.complemento + 
                            "\n| Bairro: " + this.bairro + 
                            "\n| Cidade: " + this.cidade + " " + "| Estado: " + this.estado + 
                            "\n| País: " + this.pais;
        return retorno2;
    }
    
}
