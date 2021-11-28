package view;

import java.util.Scanner;
import java.util.ArrayList;
import controller.LivroController;
import model.Livro;

public class CadastroLivrosView {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        LivroController controller = new LivroController();
        int opcaoEscolhida;
        
        cabeçalho();

        do{
            opcaoEscolhida = menu(sc);
            switch(opcaoEscolhida){
                case 1: 
                        cadastrar(sc, controller);   
                break;
                case 2:
                        listar(controller);
                break;
                case 3:
                        alterar(controller);;
                break;
                case 4:
                        deletar(controller);
                break;
                case 0:
                        System.out.println("Saindo do programa...");
                break;
            }
        }while(opcaoEscolhida != 0);
    }

    static void alterar(LivroController controller){
        Livro idAlterar = null;
        do {
            System.out.print("\nDigite o número do ID do livro que deseja alterar: ");
            int id = Integer.parseInt(sc.nextLine());

            if(controller.verify(id) != null){
                System.out.print("Digite o título do livro: ");
                String titulo = sc.nextLine();
                System.out.print("Digite o(os) autor(es): ");
                String autor = sc.nextLine();
                System.out.print("Digite a editora: ");
                String editora = sc.nextLine();
                System.out.print("Digite a categoria: ");
                String categoria = sc.nextLine();

                idAlterar = new Livro(id, titulo, autor, editora, categoria);
                controller.alterar(idAlterar);
                
                System.out.println("\nAs informações do livro foram atualizadas com sucesso!");
            } else{
                System.out.println("O ID informado não foi localizado.");
            }
        } while (idAlterar == null);
    }

    static void deletar(LivroController controller){
        Livro idDeletar = null;
        do{
            System.out.print("\nDigite o ID do livro que você deseja deletar: ");
            int id = Integer.parseInt(sc.nextLine());
            idDeletar = controller.verify(id);
                if (idDeletar != null) {
                    controller.deletar(idDeletar);  
                    System.out.println("\nAs informações do livro foram deletadas com sucesso!");              
                } else{
                    System.out.println("O ID informado não foi localizado.");
                }
        } while(idDeletar == null);
    }

    static void listar(LivroController controller){
        ArrayList<Livro> lista = controller.listar();
        for (Livro livros : lista) {
            System.out.print(livros);
        }
    }

    static void cadastrar(Scanner sc, LivroController controller) {
        System.out.print("\nDigite o ID do livro: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();
        System.out.print("Digite o(os) autor(es): ");
        String autor = sc.nextLine();
        System.out.print("Digite a editora: ");
        String editora = sc.nextLine();
        System.out.print("Digite a categoria: ");
        String categoria = sc.nextLine();
        Livro novoLivro = new Livro(id, titulo, autor, editora, categoria);
        controller.salvar(novoLivro);
    }

    static int menu(Scanner sc) {
        System.out.println("\nMenu de Opções:");
        System.out.println("\n\t1 - Cadastrar\n\t2 - Listar\n\t3 - Alterar\n\t4 - Deletar\n\t0 - Sair");
        System.out.print("\nDigite a opção escolhida: ");
        int opcaoEscolhida = Integer.parseInt(sc.nextLine());
        return opcaoEscolhida;
    }

    static void cabeçalho() {
        System.out.println("\n===============  Sistema de Cadastro de Livros  ===============");
        System.out.println("\t==========     Seja bem-vindo(a)!     ==========");
    }
    
}
