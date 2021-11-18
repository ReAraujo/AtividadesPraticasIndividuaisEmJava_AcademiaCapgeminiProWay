/* - Crie uma classe para cálculo de impostos
   - A classe de calculo deve possuir 3 métodos:
     um para calculo de ISS
     outro para cálculo de IOF
     outro para cálculo de IR
   - A classe deve manter em variáveis privadas o valor de cada imposto que deve ser definido por você
   - Os métodos devem receber como parâmetro um valor que servirá de base para cálculo do imposto
     e retornar o valor do imposto calculado  
   - Crie uma segunda classe que contenha o método main
   - Nesta segunda classe, crie um objeto da classe calculadora, realize a chamada aos 
     três métodos e ao final da execução, imprima o valor de todos os impostos calculados  
*/
package AtividadePratica17;

public class PrincipalCalculadoraImpostos {
    public static void main(String[] args) {

        CalculodeImpostos calcImpostos = new CalculodeImpostos();

        double taxaISS1 = calcImpostos.calculoISS(100);
        double taxaIOF1 = calcImpostos.calculoIOF(100);
        double taxaIR1 = calcImpostos.calculoIR(100);

        cabecalho();
        System.out.println();
    
        System.out.printf("O valor cobrado do imposto ISS foi de R$ %.2f.", taxaISS1);
        System.out.printf("\nO valor cobrado do imposto IOF foi de R$ %.2f.", taxaIOF1);
        System.out.printf("\nO valor cobrado do imposto IR foi de R$ %.2f.", taxaIR1);
        System.out.println("\n====================================================");
    }
    static void cabecalho(){
        System.out.println("=============== Atividade Prática: 17 ==============");
        System.out.println("======== Cálculo de Impostos: ISS, IOF e IR ========");
        System.out.println("====================================================");
    }
}
