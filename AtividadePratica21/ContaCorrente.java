/* - Crie uma classe Conta Corrente com os atributos privados: 
     taxa transferência, taxa manutenção e número de transferências.  
   - Defina um valor padrão para taxa de transferência de R$10.50, 
     um valor de R$2.50 para taxa de manutenção e 0 para o número de transferências;
   - A classe Conta Corrente deve herdar da classe Conta.
  
*/
package AtividadePratica21;

public class ContaCorrente extends Conta {
    private Double taxaTransferencia = 10.50;
    private Double taxaManutencao = 2.50;
    private int quantidadeTransferencias = 0;

    @Override
    public void transferencia(double valorTransferencia){
        super.transferencia(valorTransferencia);
        double novoSaldo = this.getSaldo() - taxaTransferencia;
        this.setSaldo(novoSaldo);

        quantidadeTransferencias++;
        if(quantidadeTransferencias % 5 == 0 ){
             novoSaldo = this.getSaldo() - taxaManutencao;
             this.setSaldo(novoSaldo);
        }  

    }
    
}
