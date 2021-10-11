/* - crie um programa que solicite ao usuário que digite a idade
   - armazene a idade em uma variável tipo byte 
   - imprima uma mensagem para idade maior que 25 anos
   - imprima uma mensagem para idade menor que 25 anos
   - imprima uma mensagem para idade igual a 25 anos 
*/
package AtividadePratica10;

import java.util.Scanner;

public class AtividadePratica10_idade{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============== Programa 1: Idade ===============");     
        System.out.println("\n============== Seja bem-vindo(a)! ===============");   
        
        System.out.println("Informe quantos anos você tem: ");
        byte idade = Byte.parseByte(sc.nextLine());

        if(idade > 25){
            System.out.println("Você tem mais que 25 anos!");
        }
        else if(idade > 0 && idade < 25){
            System.out.println("Você tem menos que 25 anos!");
        }
        else if(idade == 25){
            System.out.println("Que legal! Você tem 25 anos!");
        }
        else{
            System.out.println("Dado digitado é inválido!");
        }
        System.out.println("======================= Fim =====================");
    }
}