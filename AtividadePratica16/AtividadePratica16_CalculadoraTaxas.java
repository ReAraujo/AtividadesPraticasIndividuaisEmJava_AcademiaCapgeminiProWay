/* - Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação 
   - Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas
   - Crie dois métodos para cálculo de taxa sobre transações bancárias, o primeiro será aplicado uma taxa 
     de 0,001% sobre o valor transferido, o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados
   - Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de 
     Taxas e execute os métodos de transferência e de saque
   - Ao final da execução do método main, imprima todos os dados das taxas cobradas
*/
package AtividadePratica16;

import java.util.Scanner;

public class AtividadePratica16_CalculadoraTaxas {
  private double saldo;
  private double resultado;
  private double novoSaldo;
  private double taxaTransferencia = 0.001;
  private double taxaSaque = 1.30;

  int opcaoEscolhida;
  int quantidadeSaques;

  static void cabecalho(){
      System.out.println("|---------------- QueenBank ----------------|");
      System.out.println("|------------ Seja bem-vindo(a)! -----------|");
  }

  public double inserirSaldo(){
    Scanner sc = new Scanner(System.in);
    System.out.print("| Informe o seu saldo atual: R$ ");
    return saldo = Double.parseDouble(sc.nextLine());
  }

  static void imprime_menu(){
    System.out.println("|------ Menu de Transações Bancárias -------|");
    System.out.println("| 1 - Transferir                            |");
    System.out.println("| 2 - Sacar                                 |");
    System.out.println("| 0 - Sair do acesso bancário               |");
    System.out.println("|-------------------------------------------|");
  }
  
  public int escolha_menu(){
    Scanner sc = new Scanner(System.in);
    imprime_menu();

      do{
          opcaoEscolhida = ler_numero("| Digite uma opção do menu: ");
      }while(opcaoEscolhida < 0 || opcaoEscolhida > 3);
      return opcaoEscolhida;
  }
  
  public void transacoes_bancarias(){
    Scanner sc = new Scanner(System.in);
    
        switch (opcaoEscolhida){
          case 1: 
              novoSaldo = transferir(sc);
              encerrar_programa();
              break;
          case 2: 
              novoSaldo = sacar(sc); 
              encerrar_programa();
              break;
          case 0:
              encerrar_programa();
              break;
          }
  }

  static void encerrar_programa() {
    System.out.println("| Encerrando programa...                    |");
    System.out.println("| Obrigada por utilizar o QueenBank!        |");
    System.out.println("| Você é o nosso melhor cliente!            |");
  }

  private double sacar(Scanner sc) {
    System.out.print("| Qual valor você deseja sacar: ");
    double valorSaque = Double.parseDouble(sc.nextLine());
    novoSaldo = saldo - valorSaque;
    System.out.print("| Saque realizado com sucesso!              |");
    System.out.printf("\n| Seu saldo atual é: R$ %.2f             |", novoSaldo);
    System.out.println("\n|-------------------------------------------|");
    return novoSaldo;
  }

  private double transferir(Scanner sc){
    double valorTaxaTrasnf;
    System.out.print("| Qual valor você deseja transferir: R$ ");
    double valorTransf = Double.parseDouble(sc.nextLine());
    resultado = saldo - valorTransf;
    valorTaxaTrasnf = (valorTransf * taxaTransferencia);
    novoSaldo = resultado - valorTaxaTrasnf;
    System.out.print("| Transferência realizada com sucesso!      |");
    System.out.printf("\n| Taxa do serviço de transferência: R$ %.2f |", valorTaxaTrasnf);
    System.out.printf("\n| Seu saldo atual é: R$ %.2f              |", novoSaldo);
    System.out.println("\n|-------------------------------------------|");
    return novoSaldo;
  }

  static int ler_numero(String mensagem){
    Scanner sc = new Scanner(System.in);
    System.out.print(mensagem);
    int numero = Integer.parseInt(sc.nextLine());
    return numero;
 }
    
}
