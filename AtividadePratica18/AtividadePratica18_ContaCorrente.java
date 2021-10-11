/* - Crie uma classe Conta Corrente com os atributos Agência, Numero, Codigo do Cliente e Saldo.
   - Todos os atributos da classe Conta Corrente devem ser privados.
   - Construa os métodos get e set para cada um dos atributos da classe.
*/
package AtividadePratica18;

public class AtividadePratica18_ContaCorrente {
    private int agencia;
    private int numero;
    private int codigoCliente;
    private double saldo;

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

    public void setcodigoCliente(int codigoCliente){
        this.codigoCliente = codigoCliente;
    }
    public int getcodigoCliente(){
        return this.codigoCliente;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public Double getSaldo(){
        return this.saldo;
    }





    
}
