/* - Crie uma classe Calculadora.
   - Adicione a classe Calculadora um método soma que recebe dois parâmetros e inteiros e retorna um inteiro com o resultado.
   - Adicione a classe Calculadora um método soma que recebe dois parâmetros double e retorna um double com o resultado.
   - Adicione a classe Calculadora um método soma que recebe três parâmetros float e retorna um float com o resultado.
   - Adicione a classe Calculadora um método soma que recebe três parâmetros long e retorna um long com o resultado.
*/
package AtividadePratica22.P3;

public class Calculadora {
    public int soma(int v1, int v2){
        return v1 + v2; 
    }
    public double soma(double v1, double v2){
        return v1 + v2;
    }
    public float soma(float v1, float v2, float v3){
        return v1 + v2 + v3;
    }
    public long soma(long v1, long v2, long v3){
        return v1 + v2 + v3;
    }    
}
