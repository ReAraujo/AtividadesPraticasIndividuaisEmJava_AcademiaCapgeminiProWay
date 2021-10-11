/* - Crie uma classe produto com os atributos Código, Nome, Descrição e Valor.
   - Todos os atributos da classe produtos devem ser privados.
   - Construa os métodos get e set para cada um dos atributos.
*/
package AtividadePratica18;

public class AtividadePratica18_Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    
    public String getNome(){
        return this.nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public Double getValor(){
        return this.valor;
    }
    


    
}
