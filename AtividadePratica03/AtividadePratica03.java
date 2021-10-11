import java.util.Scanner;

public class AtividadePratica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================  RêFlix  =====================");
        System.out.println("=================    Turuuuuum    =================");

        System.out.println("\n==============  Seja bem-vindo(a)! ================");
        System.out.println("Escolha a opção abaixo de acordo com o que você deseja cadastrar:");
        System.out.println("\t 1 - Filme");
        System.out.println("\t 2 - Série");
        System.out.println("\t 3 - Documentário");
        System.out.println("\t 0 - Para sair");

        System.out.println("\nDigite a opção escolhida: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Opção escolhida: 1 - Filme");
                System.out.println("\nInforme o nome: ");
                String nomeFilme = sc.nextLine();
                System.out.println("\nInforme a descrição: ");
                String descricaoFilme = sc.nextLine();
                System.out.println("\nInforme o gênero: ");
                String generoFilme = sc.next();
                System.out.println("\nInforme o ano de lançamento: ");
                int anoFilme = sc.nextInt();
                break;
            case 2:
                System.out.println("Opção escolhida: 2 - Série");
                System.out.println("\nInforme o nome: ");
                String nomeSerie = sc.nextLine();
                System.out.println("\nInforme o ano de lançamento: ");
                int anoSerie = sc.nextInt();
                System.out.println("\nInforme a produtora: ");
                String produtoraSerie = sc.nextLine();
                break;
            case 3:
                System.out.println("Opção escolhida: 3 - Documentário");
                System.out.println("\nInforme o nome: ");
                String nomeDocumentario = sc.nextLine();
                System.out.println("\nInforme o ano de lançamento: ");
                int anoDocumentario = sc.nextInt();
                System.out.println("\nInforme a produtora: ");
                String produtoraDocumentario = sc.nextLine();
                break;
            case 0:
                System.out.println("Fechando programa de cadastramento...");
                System.out.println("=================================================");
                break;
        }
    }
}
