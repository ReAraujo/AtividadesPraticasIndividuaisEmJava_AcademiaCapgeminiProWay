/* - Crie uma classe Tela Principal Banco que contenha um método main.
   - Nesta classe, crie um objeto da Conta Corrente, realize a chamada a todos os métodos set e get, 
     ao final da execução, imprima o valor de todos os atributos da classe.
*/
package AtividadePratica18;

public class AtividadePratica18_TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();

        cc1.setAgencia(3278);
        int age = cc1.getAgencia();

        cc1.setNumero(4158748);
        int num = cc1.getNumero();

        cc1.setcodigoCliente(85419687);
        int codCliente = cc1.getcodigoCliente();

        cc1.setSaldo(8956.45);
        double saldoConta = cc1.getSaldo();

        cabecalhoBanco();
        System.out.println(" Informações bancárias: ");
        System.out.printf("\n  Agência: %d ", age);
        System.out.printf("\n  Número: %d ", num);
        System.out.printf("\n  Código cliente: %d ", codCliente);
        System.out.printf("\n  Saldo em conta: R$ %.2f",saldoConta);
        encerraBanco();
        
    }
    static void cabecalhoBanco(){
        System.out.println(" ______________________________________ ");
        System.out.println("|          International Bank          |");
        System.out.println("|                                      |");
        System.out.println("|--------- Seja bem-vindo(a)! ---------|");
        System.out.println("|--------------------------------------|");
        System.out.println();
    }
    static void encerraBanco(){
        System.out.print("\n|______________________________________|");
    }

    
}
