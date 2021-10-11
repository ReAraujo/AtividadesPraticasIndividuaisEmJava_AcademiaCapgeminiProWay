import java.util.Scanner;

public class AtividadePratica02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================== Ambiente de Cadastro de Clientes ====================");
        System.out.println("\tSeja bem-vindo(a)!");

        System.out.println("\tInforme nos campos a seguir os dados do(a) cliente a ser cadastrado(a):");

        System.out.print("\tInforme o nome: ");
        String nomeCliente = sc.next();
        System.out.print("\tInforme o sobrenome: ");
        String sobrenomeCliente = sc.next();
        System.out.print("\tInforme a idade: ");
        int idadeCliente = sc.nextInt();

        if (idadeCliente < 18) {
            System.out.print("\nO/A cliente é menor de idade. O cadastro dele(a) não poderá ser realizado!");
            System.out.println("\n==============================================================================\n");
        }else{
            System.out.print("\nO/A cliente é maior de idade.");
            System.out.print("\nO cadastro do(a) cliente foi realizado com sucesso!");
            System.out.print("\nResumo dos dados inseridos: \n");
            System.out.printf("Nome: %s. Sobrenome: %s. Idade: %d anos.", nomeCliente,sobrenomeCliente,idadeCliente);
            System.out.println("\n==============================================================================\n");
        }
    }
}
