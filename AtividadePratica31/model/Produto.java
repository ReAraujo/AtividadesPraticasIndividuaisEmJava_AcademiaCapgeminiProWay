package model;

public class Produto extends Base { // Herança
    public int id;
    public String nomeProd;
    public String descricaoProd;
    public double valorProd;
    public Categoria categoriaProduto; // Composição 

    // Método construtor da Classe 
    public Produto() {
        this.nomeProd = nomeProd;
        this.descricaoProd = descricaoProd;
        this.valorProd = valorProd;
        this.categoriaProduto = categoriaProduto;
    }

    // Método toString de sobescrita
    @Override
    public String toString() {
        String retorno = super.toString() + 
                        "| Nome Produto: " + this.nomeProd + " " +
                        "| Descrição: " + this.descricaoProd + " " + 
                        "| Valor: R$ " + this.valorProd + " " + 
                        "| Categoria do Produto: " + this.categoriaProduto;
        return retorno;
    }
}
