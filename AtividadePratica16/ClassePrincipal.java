/* - Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação - Ok
   - Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas - OK
   - Crie dois métodos para cálculo de taxa sobre transações bancárias: 
     o primeiro será aplicado uma taxa de 0,001% sobre o valor transferido
     o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados
   - Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de 
     Taxas e execute os métodos de transferência e de saque
   - Ao final da execução do método main, imprima todos os dados das taxas cobradas
*/
package AtividadePratica16;

public class ClassePrincipal {
    public static void main(String[] args) {

        CalculadoraTaxas cc1 = new CalculadoraTaxas();
        
        cabecalho();

        inserirSaldo();

        escolha_menu();
        
        cc1.transacoes_bancarias();

      
    }

    static void cabecalho(){
      System.out.println("|---------------- QueenBank ----------------|");
      System.out.println("|------------ Seja bem-vindo(a)! -----------|");
    }

    static double inserirSaldo(){
      Scanner sc = new Scanner(System.in);
      System.out.print("| Informe o seu saldo atual: R$ ");
      double saldo = Double.parseDouble(sc.nextLine());
      return saldo;
    }

    static void imprime_menu(){
      System.out.println("|------ Menu de Transações Bancárias -------|");
      System.out.println("| 1 - Transferir                            |");
      System.out.println("| 2 - Sacar                                 |");
      System.out.println("| 0 - Sair do acesso bancário               |");
      System.out.println("|-------------------------------------------|");
    } 
    static int escolha_menu(){
      int opcaoEscolhida;
      Scanner sc = new Scanner(System.in);
      imprime_menu();
  
        do{
            opcaoEscolhida = ler_numero("| Digite uma opção do menu: ");
        }while(opcaoEscolhida < 0 || opcaoEscolhida > 3);
        return opcaoEscolhida;
    }
    

}    
