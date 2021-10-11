/* - Crie uma classe Números com um método main.
   - Crie nesta classe um array de números inteiros com 10 posições.
   - Adicione um valor para cada posição do array.
   - Imprima ao final da execução do main, todas as posições do array utilizando o laço de repetição for.
*/
package AtividadePratica19.Parte01;

public class AtividadePratica19_Numeros {
    public static void main(String[] args) {

        int[] metas = new int[10];
        metas[0] = 10;
        metas[1] = 20;
        metas[2] = 30;
        metas[3] = 40;
        metas[4] = 50;
        metas[5] = 60;
        metas[6] = 70;
        metas[7] = 80;
        metas[8] = 90;
        metas[9] = 100;

        for (int i = 0; i < metas.length; i++) {
            System.out.println(metas[i]);
        }

    }
    
}
