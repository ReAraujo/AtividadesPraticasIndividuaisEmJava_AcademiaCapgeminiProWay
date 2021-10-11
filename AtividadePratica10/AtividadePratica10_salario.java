/* - crie um programa que solicite ao usuário que digire o salário
   - armazene em uma variável do tipo double 
   - imprima uma mensagem caso o salário seja maior que R$ 1997.58
   - imprima outra mensagem caso o salário for maior que R$ 5.399.99
   - e outra mensagem se o salário for digitado menor ou igual a zero
   - caso o salário seja menor ou igual a zero, o sistema deve solicitar que o 
     usuário digite novamente o salário novamente 
   - para então realizar as validações de faixas salariais mais uma vez até que o usuário
     digite acima de zero      
*/
package AtividadePratica10;

import java.util.Scanner;

public class AtividadePratica10_salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=============== Programa 2: Salário ===============");     
        System.out.println("\n=============== Seja bem-vindo(a)! ================");

        double salario = 0.0; 

        do{
            System.out.print("Digite o valor do seu salário atual: ");
            salario = Double.parseDouble(sc.nextLine());
            if(salario > 1997.58 && salario < 5399.98){
                System.out.println("O seu salário se enquadra na faixa 1.");
            }
            else if(salario > 5399.99){
                System.out.println("O seu salário se enquadra na faixa 2.");
            }
            else if (salario <= 0){
                System.out.println("O valor digitado é negativo ou igual a zero. Esses valores não são aceitos.");
            }
        } while (salario <=0);

        System.out.println("======================== Fim =======================");
    }
    
}
