/* - Crie uma classe Tela com um método main, crie um objeto da classe Calculadora, 
     chame cada método criado e imprima seus resultados.
*/
package AtividadePratica22.AtividadePratica22_P3;

public class package AtividadePratica22.AtividadePratica22_P3; {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int r1 = c.soma(450, 800);
        double r2 = c.soma(10.59, 85.23);
        float r3 = c.soma(1.1f, 3.5f, 8.9f);
        long r4 = c.soma(123, 523, 96);

        System.out.println("Resultados: ");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
    
}
