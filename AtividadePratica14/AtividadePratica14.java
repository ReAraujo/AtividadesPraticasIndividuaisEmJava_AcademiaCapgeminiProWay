/* - Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. 
     A mensagem deve exibir a mensagem “Calculadora” 
   - Construa um método que imprima o menu de opções contendo as opções somar, subtratir, multiplicar e dividir. 
   - Construa um método que solicite ao usuario que ele digite uma das opções do menu, armazene a opção em uma variável, 
     valide o valor e retorne apenas quando uma opção válida for digitada.   
   - Crie um método que receba a opção escolhida pelo usuário e encaminhe para o método que irá 
     realizar a operação correta, seja de soma, subtração, multiplicação e divisão.
   - Construa os metodos de soma,  subtração, multiplicação e divisão.Todos os métodos devem receber 
     dois parâmetros double realizar a operação e retornar o valor do cálculo.
   - Imprima o resultado das operações fora do metodo que realiza o cálculo.  
*/
import java.util.Scanner;

public class AtividadePratica14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
        cabecalho();
        menu();
        double opcao = ler("Digite uma opção do menu: ");    
        selecionar_menu(opcao);
    }
    static void cabecalho(){
        System.out.println("===================================================");
        System.out.println("------------------- Calculadora -------------------");
        System.out.println("===================================================");
    }
    static void menu(){
        System.out.println("----------------- Menu de opções: -----------------");
        System.out.println("1 - Somar   ");
        System.out.println("2 - Subtrair ");
        System.out.println("3 - Multiplicar ");
        System.out.println("4 - Dividir ");
        System.out.println("0 - Sair ");
    }
    static void selecionar_menu(double opcao){
        double n1 = 0.0;
        double n2 = 0.0;
        int opcaoEscolhida = (int) opcao;
        switch(opcaoEscolhida){
            case 1: 
                n1 = ler("Digite o n1: ");
                n2 = ler("Digite o n2: ");
                double somaResultado = somar(n1, n2);
                System.out.printf("O resultado da soma é: %.2f\n", somaResultado);
            break;
            case 2:
                n1 = ler("Digite o n1: ");
                n2 = ler("Digite o n2: ");
                double subtracaoResultado = subtrair(n1, n2);
                System.out.printf("O resultado da subtração é: %.2f\n", subtracaoResultado);
            break;
            case 3:
                n1 = ler("Digite o n1: ");
                n2 = ler("Digite o n2: ");
                double multiplicacaoResultado = multiplicar(n1, n2);
                System.out.printf("O resultado da multiplicação é: %.2f\n", multiplicacaoResultado);
            break;
            case 4:
                n1 = ler("Digite o n1: ");
                n2 = ler("Digite o n2: ");
                double divisaoResultado = dividir(n1, n2);
                System.out.printf("O resultado da divisão é: %.2f\n", divisaoResultado);
            break;
            case 0: 
                System.out.println("Saindo do programa... ");
            break;   
            default: 
                System.out.println("Opção digitada é inválida!");       
        }    
    }
    static double ler(String mensagem){
        System.out.print(mensagem);
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }   
    static double somar(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }
    static double subtrair(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;
    }
    static double multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return resultado;
    }
    static double dividir(double numero1, double numero2){
        double resultado = numero1 / numero2;
        return resultado;
    }     
}
