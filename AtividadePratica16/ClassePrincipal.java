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

import java.util.Scanner;

public class ClassePrincipal {
  static Scanner sc = new Scanner(System.in);
  static CalculadoraTaxas calcTaxas = new CalculadoraTaxas();
  static double taxaTransferencia = 0;
  static double taxaSaque = 0;

  public static void main(String[] args) {
    boolean continua;
        
    cabecalho();

    imprime_menu();

    do{
      int opcao = escolhaOpcaoMenu();
      operacoesMenu(opcao);
      continua = retornaMenu();
    } while(continua);
    
    }

    static void cabecalho(){
      System.out.println("|---------------- QueenBank ----------------|");
      System.out.println("|------------ Seja bem-vindo(a)! -----------|");
    }

    static void imprime_menu(){
      System.out.println("|------ Menu de Transações Bancárias -------|");
      System.out.println("| 1 - Transferir                            |");
      System.out.println("| 2 - Sacar                                 |");
      System.out.println("| 0 - Sair do acesso bancário               |");
      System.out.println("|-------------------------------------------|");
    } 

    static int escolhaOpcaoMenu(){
      int opcao = 0;
      do{
        System.out.print("| Digite a opção do menu desejada: ");
        opcao = Integer.parseInt(sc.nextLine());
        if(opcao < 0 && opcao > 3){
          System.out.print("| A opção digitada é inválida. Digite novamente: ");
        }
      } while(opcao < 0 && opcao > 3);
      return opcao;
    }

    static void operacoesMenu(int opcao){
      switch (opcao) {
        case 1:
                System.out.println("| A opção escolhida foi: Realizar transferência");
                double taxaTransf = transferir();
                taxaTransferencia += taxaTransf;
                System.out.print("| Transferência realizada com sucesso!      |");
                System.out.printf("\n| Taxa do serviço de transferência: R$ %.2f |", taxaTransf);
                System.out.println("\n|-------------------------------------------|");
          break;
        case 2:
                System.out.println("| A opção escolhida foi: Realizar saque");
                double taxaSaq = sacar();
                taxaSaque += taxaSaq;
                System.out.print("| Saque realizado com sucesso!              |");
                System.out.printf("\n| Taxa do serviço de saque: R$ %.2f |", taxaSaq);
                System.out.println("\n|-------------------------------------------|");
          break;
        case 0:
                encerrar_programa();  
          break;  
      }
    }
  
    static double transferir(){
      System.out.print("| Digite o valor que você deseja transferir: R$ ");
      double valorTransf = Double.parseDouble(sc.nextLine());
      double taxaTransfere = calcTaxas.calculoTaxaTransf(valorTransf);
      return taxaTransfere;
    }

    static double sacar() {
      System.out.print("| Digite o valor que você deseja sacar: ");
      double valorSaque = Double.parseDouble(sc.nextLine());
      double taxaSacar = calcTaxas.calculoTaxaSaque(valorSaque);
      return taxaSacar;
    }

    static boolean retornaMenu(){
      boolean retornar = false;
      char opcaoRetorno;

      do {
        System.out.print("| Deseja voltar ao menu principal?  ");
        System.out.print("| Digite (S = Sim | N = Não): ");
        opcaoRetorno = sc.nextLine().toUpperCase().charAt(0);

        if (opcaoRetorno == 'S') {
          retornar = true;

        } else if (opcaoRetorno == 'N'){
          System.out.printf("| O valor das taxas de serviços cobradas foi de R$ %.2f de taxa de trasnferência e R$ %.2f de taxa de saque dando o total de R$ %.2f de taxas",
          taxaTransferencia, taxaSaque, taxaTransferencia + taxaSaque );
          encerrar_programa();

        } else {
          System.out.print("| A opção digitada é inválida. Digite novamente (S/N): ");
        }
      } while (opcaoRetorno != 'S' && opcaoRetorno != 'N');

      return retornar;
    }

    static void encerrar_programa() {
      System.out.println("\n| Encerrando programa...                    |");
      System.out.println("| Obrigada por utilizar o QueenBank!        |");
      System.out.println("| Você é o nosso melhor cliente!            |");
    }

}    
