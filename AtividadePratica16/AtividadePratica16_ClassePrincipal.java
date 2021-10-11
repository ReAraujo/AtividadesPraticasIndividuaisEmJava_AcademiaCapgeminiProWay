/* - Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação - Ok
   - Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas - OK
   - Crie dois métodos para cálculo de taxa sobre transações bancárias: 
     o primeiro será aplicado uma taxa de 0,001% sobre o valor transferido
     o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados
   - Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de 
     Taxas e execute os métodos de transferência e de saque
   - Ao final da execução do método main, imprima todos os dados das taxas cobradas
*/
package AtividadePratica16;

public class AtividadePratica16_ClassePrincipal {
    public static void main(String[] args) {

        CalculadoraTaxas cc1 = new CalculadoraTaxas();
        
        cc1.cabecalho();

        cc1.inserirSaldo();

        cc1.escolha_menu();
        
        cc1.transacoes_bancarias();


    }
    
}
