import java.util.Scanner;

public class AtividadePratica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================* Mia's Store - Ambiente de Cadastro *=====================");
        System.out.println("\tSeja bem-vindo(a) ao Ambiente de Cadastro de Produtos e Categorias\n");
        System.out.print("\tInforme a numeração da sua matrícula de colaborador: ");
        int cadastroColaborador = sc.nextInt();

        System.out.print("\tInforme o nome do produto: ");
        String nomeProduto = sc.next();
       
        System.out.printf("\tInforme a descrição do produto %s: ", nomeProduto);
        String descricaoProduto = sc.next();

        System.out.printf("\tInforme o valor do produto %s: ", nomeProduto);
        float valorProduto = sc.nextFloat();

        System.out.printf("\tInforme a categoria do produto %s: ", nomeProduto);
        String categoriaProduto = sc.next();

        System.out.printf("\tO cadastro do produto %s foi realizado com sucesso!\n", nomeProduto);

        System.out.println("==============================================================================");
        System.out.printf("\tResumo do cadastro: \n");
        System.out.printf("\tColaborador: %d \n", cadastroColaborador);
        System.out.printf("\tNome do produto: %s \n", nomeProduto);
        System.out.printf("\tDescrição: %s \n", descricaoProduto);
        System.out.printf("\tValor: %.2f \n", valorProduto);
        System.out.printf("\tCategoria: %s \n", categoriaProduto);
        System.out.println("==============================================================================\n");
    }
}
