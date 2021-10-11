/* - Crie uma classe Conta Corrente com os atributos privados: saldo, taxa saque e codigo de cliente.
   - Crie um método Construtor na classe Conta Corrente que receba o valor do saldo e do código do cliente;
   - Crie um método saque que recebe um valor double e que debita do saldo o valor mais a taxa de saque.
   - Crie um método depósito que recebe um valor double e soma ao valor do saldo.
   - Adicione um valor fixo ao atributo taxa saque;
*/
package AtividadePratica22.AtividadePratica22_P2;;

public class ContaCorrente {
    private double saldo_inicial;
    private double saldo;
    private double taxa_saque = 2.50;
    private String codigo_cliente;

    public ContaCorrente(double saldo, String codigo_cliente){
        this.saldo_inicial = saldo;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public void saque(double valor_saque){
        this.saldo -= valor_saque + this.taxa_saque;  
    }

    public void deposito(double valor_deposito){
        this.saldo += valor_deposito;
    }

    public String toString(){
        String inicio = "=============== Banco ===============\n";
        String impreessao_dados = "Código de cliente: " + this.codigo_cliente +  "\nSaldo em conta: R$ " + 
            this.saldo_inicial + "\nTaxa de saque: R$ " + this.taxa_saque + "\nSaldo final: R$ " + this.saldo;
        return inicio + impreessao_dados;    
    }

    



    
}
