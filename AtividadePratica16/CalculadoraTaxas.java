/* - Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação 
   - Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas
   - Crie dois métodos para cálculo de taxa sobre transações bancárias, o primeiro será aplicado uma taxa 
     de 0,001% sobre o valor transferido, o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados
   - Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de 
     Taxas e execute os métodos de transferência e de saque
   - Ao final da execução do método main, imprima todos os dados das taxas cobradas
*/
package AtividadePratica16;

public class CalculadoraTaxas {
  private double valorTaxaTransf = 0.00001;
  private double valorTaxaSaque = 1.30;
  private int qtdSaques = 0;
  
  
  public double calculoTaxaTransf(double saldo){
    double taxaTransf = saldo * valorTaxaTransf; 
    return taxaTransf;
  }

  public double calculoTaxaSaque(double saldo){
    double taxaSaque = 0;
    qtdSaques++;

    if(qtdSaques % 5 == 0){
      taxaSaque = valorTaxaSaque;
    }
    
    return taxaSaque;
  }

}
