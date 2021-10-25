/*_  Crie uma calculadora para realizar as quatro operações básicas: soma, subtração, multiplicação e divisão.
  _  Deve possuir um menu para o usuário escolher a operação a realizar.
  _  O sistema deve possuir um tratamento de exceção para evitar erro em uma divisão por zero.
  _  O sistema deve possuir um tratamento de exceção durante a leitura dos dados para evitar que o usuário insira 
     algo diferente de números inteiros tanto para as operação quanto para o menu. 
*/
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int n1 = 0;
        int n2 = 0;
        int resultado = 0;
        boolean continua;
        
        do{
            cabecalho();
            imprime_menu();
            int opcao = ler_opcao_menu();

                switch(opcao){
                    case 1: 
                            System.out.println("Opção escolhida: Somar");
                            n1 = ler_numero_inteiro("\nDigite o primeiro número: ");
                            n2 = ler_numero_inteiro("Digite o segundo número: ");
                            resultado = calc.somar(n1, n2);
                            System.out.printf("O resultado da somatória é: %d", resultado);
                    break;
                    case 2: System.out.println("Opção escolhida: Subtrair");
                            n1 = ler_numero_inteiro("\nDigite o primeiro número: ");
                            n2 = ler_numero_inteiro("Digite o segundo número: ");
                            resultado = calc.subtrair(n1, n2);
                            System.out.printf("O resultado da subtração é: %d", resultado);
                    break;
                    case 3: System.out.println("Opção escolhida: Multiplicar");
                            n1 = ler_numero_inteiro("\nDigite o primeiro número: ");
                            n2 = ler_numero_inteiro("Digite o segundo número: ");
                            resultado = calc.multiplicar(n1, n2);
                            System.out.printf("O resultado da multiplicação é: %d", resultado);
                    break;
                    case 4: System.out.println("Opção escolhida: Dividir");
                            n1 = ler_numero_inteiro("Digite o primeiro número: ");
                            boolean valida = true;
                            do{
                                try{
                                    n2 = ler_numero_inteiro("Digite o segundo número: ");
                                    valida_numero(n2);
                                    valida = true; 
                                }catch (RuntimeException ex) {
                                    System.out.println(ex.getMessage() + " Digite novamente, por favor.");
                                    valida = false;
                                }    
                            }while(!valida);

                            resultado = calc.dividir(n1, n2);
                            System.out.printf("O resultado da divisão é: %d", resultado);
                    break;
                    case 0: System.out.println("Saindo do programa em 3.. 2.. 1.. Bye-bye!");
                    break;
                }

            continua = retorna_ao_menu();
        }while(continua);
    }    

    static void cabecalho(){
        System.out.println("|====================    Atividade Prática 30    ====================|");
        System.out.println("|=====   Seja bem-vindo(a) ao Programa de Calculadora Básica    =====|");
    }

    static void imprime_menu(){
        System.out.println(" Escolha uma opção do menu abaixo: ");
        System.out.println("\t1 - Somar");
        System.out.println("\t2 - Subtrair");
        System.out.println("\t3 - Multiplicar");
        System.out.println("\t4 - Dividir");
        System.out.println("\t0 - Sair do programa");
    }

    static int ler_opcao_menu(){
        int opcaoEscolhida = 0;
        do{
            try {
                System.out.print("Digite a opção escolhida: ");
                opcaoEscolhida = Integer.parseInt(sc.nextLine());

                if(opcaoEscolhida < 0 || opcaoEscolhida >= 5){
                    throw new IllegalArgumentException("A informação digitada é inválida! A opção escolhida deverá estar entre as opções 0 e 4!");
                }
            }
            catch (NumberFormatException ex) {
                System.out.println(ex.getMessage() + " Por favor, digite novamente.");
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage() + " Por favor, digite novamente.");
            }
        }while(opcaoEscolhida <= -1 || opcaoEscolhida >= 5);    

        return opcaoEscolhida;
    }

    static boolean retorna_ao_menu(){
        boolean resposta = false;
        char resposta_continua;
        
        do{
            System.out.print("\n\nDeseja voltar ao menu? (S = sim/N = não). Digite: ");
                resposta_continua = sc.nextLine().toUpperCase().charAt(0);
                
                if(resposta_continua == 'S'){
                    resposta = true;
                }
                else if(resposta_continua == 'N'){
                    System.out.println("Até mais!");
                    resposta = false;
                }
                else{
                    System.out.println("Opção inválida. Digite (S/N)!");
                }
        }while(resposta_continua != 'S' && resposta_continua != 'N');  

        return resposta;    
    }

    static int ler_numero_inteiro(String mensagem){        
        int numero = 0;
        boolean valida = true;

        do{
            System.out.print(mensagem);
            try {
                numero = Integer.parseInt(sc.nextLine()); 
                valida = true;    
            }
            catch (NumberFormatException ex) {
                System.out.println("Informação digitada inválida! Digite novamente, por favor.");
                valida = false;
            }
        }while(!valida);   

        return numero;
    }

    static void valida_numero(int n2){              
        if(n2 == 0){
            throw new RuntimeException("Número digitado é inválido!");
        }       
    }



}