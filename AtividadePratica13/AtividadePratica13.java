import java.util.Scanner;

public class AtividadePratica13 {

     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int soma1, soma2, soma3,soma4;

        cabecalho();

        soma1 = somar1();

        soma2 = somar2();

        soma3 = somar3();

        soma4 = somar4();

        mediana(CalculoMedia(soma1, soma2, soma3, soma4));
        
        sc.close();
        

    }
    private static void cabecalho() {
        System.out.println("=============== Calculo de Media ==============");
    }
    
    private static double mediana(double CalculoMedia) {
      
        CabecalhoMedia();
    
        System.out.printf("\n O total da média:  %.2f\n", CalculoMedia);
        return CalculoMedia;
    }
    private static void CabecalhoMedia() {
        System.out.println("============== Resultado de Media =============");
    }
    private static double CalculoMedia(int soma1, int soma2, int soma3, int soma4) {
        double media;
        media = (soma1+soma2+soma3+soma4)/4;
        return media;
    }

    private static int somar4() {
        int primeiroValor;
        int segundoValor;
        int soma4;
        System.out.println("============== Calculo da Soma 4 ==============");
        System.out.print("\n Informe o primeiro valor: ");
        primeiroValor = Integer.parseInt(sc.nextLine());
        System.out.print("\n Informe o segundo valor: ");
        segundoValor = Integer.parseInt(sc.nextLine());
        
        
        soma4 = SomarTotal(primeiroValor, segundoValor);
        System.out.printf("\n O total da soma 4 é: %d\n",soma4);
        System.out.println("===============================================");
        return soma4;
    }

    private static int somar3() {
        int primeiroValor;
        int segundoValor;
        int soma3;
        System.out.println("============== Calculo da Soma 3 ==============");
        System.out.print("\n Informe o primeiro valor: ");
        primeiroValor = Integer.parseInt(sc.nextLine());
        System.out.print("\n Informe o segundo valor: ");
        segundoValor = Integer.parseInt(sc.nextLine());
        
        
        soma3 = SomarTotal(primeiroValor, segundoValor);
        System.out.printf("\n O total da soma 3 é: %d\n",soma3);
        System.out.println("===============================================");
        return soma3;
    }

    private static int somar2() {
        int primeiroValor;
        int segundoValor;
        int soma2;
        System.out.println("============== Calculo da Soma 2 ==============");
        System.out.print("\n Informe o primeiro valor: ");
        primeiroValor = Integer.parseInt(sc.nextLine());
        System.out.print("\n Informe o segundo valor: ");
        segundoValor = Integer.parseInt(sc.nextLine());
        
        
        soma2 = SomarTotal(primeiroValor, segundoValor);
        System.out.printf("\n O total da soma 2 é: %d\n",soma2);
        System.out.println("===============================================");
        return soma2;
    }

    private static int somar1() {
        int primeiroValor;
        int segundoValor;
        int soma1;
        System.out.println("============== Calculo da Soma 1 ==============");
        System.out.print("\n Informe o primeiro valor: ");
        primeiroValor = Integer.parseInt(sc.nextLine());
        System.out.print("\n Informe o segundo valor: ");
        segundoValor = Integer.parseInt(sc.nextLine());
        
        
        soma1 = SomarTotal(primeiroValor, segundoValor);
        System.out.printf("\n O total da soma 1 é: %d\n",soma1);
        System.out.println("===============================================");
        return soma1;
    }
    private static int SomarTotal(int primeiroValor, int segundoValor) {
        int soma1;
        soma1 = primeiroValor+segundoValor;
        return soma1;
    }
}
