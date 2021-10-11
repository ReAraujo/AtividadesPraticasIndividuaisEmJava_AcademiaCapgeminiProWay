/* - armazene o seu nome completo em duas variáveis, nome e sobrenome;
   - imprima seu nome 10 vezes no terminal com a função printf usando o laço de repetição while
     utilizando uma variável contadora
   - recrie o passo anterior feito com o while agora com o laço for.
*/

import java.util.Scanner;

public class AtividadePratica06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "", sobrenome = "";
        int contador = 0;

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe o seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("========== While ==========");
        while(contador < 10){
            System.out.printf(" %s %s \n", nome, sobrenome);
            contador++;
        }
        System.out.println("=========== For ===========");

        for (int i = 0; i < 10; i++) {
            System.out.printf(" %s %s \n", nome, sobrenome);

        }
    }
}
