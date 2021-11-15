import java.util.Scanner;

public class AtividadePratica07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Menu de opções: ");
        System.out.println("\t 1 - Números pares");
        System.out.println("\t 2 - Números ímpares");
        System.out.println("\t 3 - Números primos");
        System.out.println("\t 4 - Cálculo de juros compostos");
        System.out.println("\t 0 - Sair");
        System.out.println("Escolha uma opção no menu:");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        while (opcaoEscolhida < 0 || opcaoEscolhida > 4){
            System.out.println("Opção digitada inválida! Digite novamente:");
            opcaoEscolhida = sc.nextInt();
        }

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Opção escolhida: 1 - Números pares");
                System.out.println("Digite o valor limite de amostra de números pares: ");
                int numeroPar = sc.nextInt();

                while(numeroPar < 0) {
                    System.out.println("O número não pode ser negativo.");
                    System.out.println("Digite novamente: ");
                    numeroPar = sc.nextInt();
                }
                for (int par = 0; par <= numeroPar; par += 2) {
                    System.out.println(par);
                }
                break;

            case 2:
                System.out.println("Opção escolhida: 2 - Números ímpares");
                System.out.println("Digite o valor limite de amostra de números ímpares: ");
                int numeroImpar = sc.nextInt();

                while(numeroImpar < 0) {
                    System.out.println("O número não pode ser negativo.");
                    System.out.println("Digite novamente: ");
                    numeroImpar = sc.nextInt();
                }
                for (int impar = 1; impar <= numeroImpar; impar+=2) {
                    System.out.println(impar);
                }
                break;

            case 3:
                System.out.println("Opção escolhida: 3 - Números primos");
                System.out.println("Digite o valor limite de amostra de números primos: ");
                int numeroPrimo = sc.nextInt();

                while(numeroPrimo < 0) {
                    System.out.println("O número não pode ser negativo.");
                    System.out.println("Digite novamente: ");
                    numeroPrimo = sc.nextInt();
                }
                for (int i = 2; i < numeroPrimo; i++) {
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
                break;
            case 4:
                System.out.println("Opção escolhida: 4 - Cálculo de juros compostos");

                System.out.println("Informe o valor do investimento: ");
                double valorInvestimento = sc.nextDouble();
                while(valorInvestimento < 0) {
                    System.out.println("O número não pode ser negativo.");
                    System.out.println("Digite novamente: ");
                    valorInvestimento = sc.nextInt();
                }

                System.out.println("Informe o prazo em meses: ");
                int quantidadeMeses = sc.nextInt();
                while(quantidadeMeses < 0) {
                    System.out.println("O número não pode ser negativo.");
                    System.out.println("Digite novamente: ");
                    quantidadeMeses = sc.nextInt();
                }

                System.out.println("Informe a taxa de juros mensal: ");
                double taxaJuros = sc.nextDouble();
                while(taxaJuros < 0) {
                    System.out.println("O número não pode ser negativo.");
                    System.out.println("Digite novamente: ");
                    taxaJuros = sc.nextDouble();
                }
                for (int i = 0; i < quantidadeMeses; i++) {
                    double retornoMensal = 0.0;
                    retornoMensal = valorInvestimento * taxaJuros;
                    valorInvestimento += retornoMensal;
                    System.out.printf("\t Mês %d: R$ %.2f \n", i + 1, valorInvestimento);
                }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
        }
    }
}
