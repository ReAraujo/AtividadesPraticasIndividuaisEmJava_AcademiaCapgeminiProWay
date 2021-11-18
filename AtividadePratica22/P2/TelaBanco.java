/* - Crie uma classe Tela Banco que contenha um método main.
   - Crie um objeto da classe Conta Corrente, insira as informações no construtor, 
     realize um saque, um depósito e imprima saldo, taxa saque e codigo de cliente usando toString;
*/
package AtividadePratica22.P2;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(5000, "895410");

        cc.saque(500);
        cc.deposito(845.10);
        System.out.println(cc);  
    }
}
