/* - Crie uma classe Conta que deve possuir os atributos privados: saldo e código do cliente.
   - Crie os métodos set e get para os atributos privados da classe Conta.
   - Crie um método transferência na classe Conta. O método deve receber um valor double e debitar do saldo da conta.
*/
package AtividadePratica21;

public class Conta {
    private Double saldo;
    private String codigoCliente;

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return this.saldo;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getCodigoCliente() {
        return this.codigoCliente;
    }

    public void transferencia(double valorTransferencia){
        saldo -= valorTransferencia;
        System.out.printf("\n| Valor a ser transferido: R$ %.2f", valorTransferencia);
    }
    
}
