package AtividadePratica28_Herança_Composicao.model;

public class Pessoa extends Base {
    public Endereco enderecoResidencial;
    public Endereco enderecoComercial;

    public Pessoa() {
        super();
        this.enderecoResidencial = enderecoResidencial;
        this.enderecoComercial = enderecoComercial;
    }
}
