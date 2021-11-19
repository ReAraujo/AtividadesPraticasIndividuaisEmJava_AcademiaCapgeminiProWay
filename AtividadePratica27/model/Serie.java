package AtividadePratica27_ArquiteturaMVC_UsoDeGenerics.model;

public class Serie extends Filme{
    public String emissora;
    public long quantidadeDeTemporadas;
    public long quantidadeDeEpisodios;

    @Override
    public String toString() {
        String impressao2 = "\n\tEmissora: " + this.emissora +
                            "\n\tQuantidade de Temporadas: " + this.quantidadeDeTemporadas +
                            "\n\tQuantidade de Episódios: " + this.quantidadeDeEpisodios  + "\n";
        return super.toString() + impressao2;
    }
}
