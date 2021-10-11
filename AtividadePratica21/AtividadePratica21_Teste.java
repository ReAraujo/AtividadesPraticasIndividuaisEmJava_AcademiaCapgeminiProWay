/* - Crie uma classe Teste, adicione um método main, crie um objeto de Conta e um objeto de Conta Corrente.
   - Utilize os métodos set para inserir os valores de saldo e de código de cliente para os dois objetos
   - Realize uma transferência em cada uma das contas
   -  Imprima os dados de código de cliente, saldo e de saldo após a transferência, para cada objeto

*/
package AtividadePratica21;

public class AtividadePratica21_Teste {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setCodigoCliente("00010");
        c1.setSaldo(6000.00);

        System.out.println("___________________________________________________");
        System.out.println("|                   - Conta -                     |");
        System.out.println("|                                                 |");
        System.out.printf("| Código de Cliente: %s", c1.getCodigoCliente());
        System.out.printf("\n| Saldo: R$ %.2f", c1.getSaldo());
        c1.transferencia(1500.00);
        System.out.printf("\n| Saldo após transferência: R$ %.2f", c1.getSaldo());
        System.out.println("\n|_________________________________________________|");


        ContaCorrente cc1 =  new ContaCorrente();
        cc1.setCodigoCliente("00011");
        cc1.setSaldo(5000.00);
        
        System.out.println("___________________________________________________");
        System.out.println("|                - Conta Corrente -                |");
        System.out.println("|                                                  |");
        System.out.printf("| Código de Cliente: %s", cc1.getCodigoCliente());
        System.out.printf("\n| Saldo: R$ %.2f", cc1.getSaldo());
        cc1.transferencia(150.00);
        cc1.transferencia(100.00);
        cc1.transferencia(100.00);
        cc1.transferencia(200.00);
        cc1.transferencia(50.00);
        cc1.transferencia(10.00);
        System.out.printf("\n| Saldo após transferência: R$ %.2f", cc1.getSaldo());
        System.out.println("\n|__________________________________________________|");





    }
    
}
