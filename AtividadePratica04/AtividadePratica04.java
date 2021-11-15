import java.util.Scanner;

/*
  Atividade Prática 4:  Cadastro de clientes
  - exibir menu com as opções: cadastrar, listar e sair
  - utilizar switch-case para o menu
  - o cadastro deve conter nome, sobrenome, RG e CPF
  - nome e sobrenome deve ter no mínimo 3 caracteres
  - RG deve conter no mínimo 4 caracteres e CPF 11 no total
 */

public class AtividadePratica04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("--------------- AquariusDev - Ambiente de Cadastro ----------------");
        System.out.println("-----------------------  Seja bem-vindo(a)!  ----------------------");
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Menu de opções: ");
        System.out.println("\t 1 - Cadastar cliente");
        System.out.println("\t 2 - Listar cliente");
        System.out.println("\t 0 - Sair");
        System.out.println("Escolha uma opção no menu:");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        switch (opcaoEscolhida){
            case 1:
                System.out.println("Opção escolhida: Cadastrar clientes");
                do {
                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres.");
                        System.out.println("Digite novamente o nome: ");
                    }
                    else{
                        invalido = false;
                    }
                }while (invalido);
                invalido = true;
                do {
                    System.out.println("Digite o sobrenome do cliente: ");
                    String sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres.");
                        System.out.println("Digite novamente o sobrenome: ");
                    }
                    else{
                        invalido = false;
                    }
                }while (invalido);
                invalido = true;
                do {
                    System.out.println("Digite o número de RG do cliente: ");
                    String numeroRG = sc.nextLine();
                    if (numeroRG.length() < 4) {
                        System.out.println("O número de RG deve ter mais que 4 caracteres.");
                        System.out.println("Digite novamente o número de RG: ");
                    }
                    else{
                        invalido = false;
                    }
                }while (invalido);
                invalido = true;
                do {
                    System.out.println("Digite o número de CPF do cliente: ");
                    String numeroCPF = sc.nextLine();
                    if (numeroCPF.length() < 11) {
                        System.out.println("O número de CPF deve ter mais que 11 caracteres.");
                        System.out.println("Digite novamente o número de CPF: ");
                    }
                    else{
                        invalido = false;
                    }
                }while (invalido);
                System.out.println("Cadastro realizado com sucesso!");
                break;
            case 2:
                System.out.println("Opção escolhida: Listar clientes");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
        }
    }
}
