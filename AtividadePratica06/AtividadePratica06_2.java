/* - imprima todos os números pares até 100 utilizando o laço for;
   - imprima todos os números primos até 150 utilizando o laço for.
 */

public class AtividadePratica06_2 {
    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("Números pares até 100: ");
        for (int par = 0; par <= 100; par+=2) {
            System.out.println(par);
        }

        System.out.println("==============================");
        System.out.println("Números primos até 150: ");
        for (int i = 2; i < 150; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
        System.out.println("==============================");
    }
}


