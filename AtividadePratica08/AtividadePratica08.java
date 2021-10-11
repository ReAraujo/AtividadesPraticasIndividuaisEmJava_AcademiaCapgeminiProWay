/* - Leia dois valores do tipo double, digitados pelo usuário;
   - Realize a chamada para um método que faz a soma entre os dois números e retorna o resultado;
   - Realize a chamada para um método que faz a subtração entre os dois números e retorna o resultado;
   - Realize a chamada para um método que faz a multiplicação entre os dois números e retorna o resultado;
   - Realize a chamada para um método que faz a divisão entre os dois números e retorna o resultado;
   - O programa deve imprimir ao final da execução todas as operações realizadas e seus resultados.
 */

import java.util.Scanner;

public class AtividadePratica08 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();

        double n1 = ler_double();
        double n2 = ler_double();

        double somaResultado = somar(n1, n2);
        double subtracaoResultado = subtrair(n1, n2);
        double multiplicacaoResultado = multiplicar(n1, n2);
        double divisaoResultado = dividir(n1, n2);

        System.out.printf("O resultado da soma é: %.2f\n", somaResultado);
        System.out.printf("O resultado da subtração é: %.2f\n", subtracaoResultado);
        System.out.printf("O resultado da multiplicação é: %.2f\n", multiplicacaoResultado);
        System.out.printf("O resultado da divisão é: %.2f\n", divisaoResultado);
    }
    static void cabecalho(){
        System.out.println("---------- Academia: Atividade Prática 8 ----------");
    }
    static double ler_double(){
        System.out.println("Digite um número: ");
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
