/* - Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação - Ok
   - Construa uma classe CalculadoraTaxas que possua os métodos de cálculo de taxas - OK
   - Crie dois métodos para cálculo de taxa sobre transações bancárias: 
     o primeiro será aplicado uma taxa de 0,001% sobre o valor transferido
     o segundo uma taxa de saque de R$1.30 a cada 5 saques realizados
   - Na classe principal, dentro do metodo main, construa um objeto da classe Calculadora de 
     Taxas e execute os métodos de transferência e de saque
   - Ao final da execução do método main, imprima todos os dados das taxas cobradas
*/
package AtividadePratica16_new;

public class AtividadePratica16_QueenBank {
    public static void main(String[] args) {
        CalculadoraTaxas cc1 = new CalculadoraTaxas();
        
        cabecalho();

        imprime_menu();

        encerrar_programa();




    }

    static void cabecalho(){
        System.out.println("|---------------- QueenBank ----------------|");
        System.out.println("|------------ Seja bem-vindo(a)! -----------|");
    }

    static void imprime_menu(){
        System.out.println("|------ Menu de Transações Bancárias -------|");
        System.out.println("| 1 - Transferir                            |");
        System.out.println("| 2 - Sacar                                 |");
        System.out.println("| 0 - Sair do acesso bancário               |");
        System.out.println("|-------------------------------------------|");
    }

    static void encerrar_programa(){
        System.out.println("| Encerrando programa...                    |");
        System.out.println("| Obrigada por utilizar o QueenBank!        |");
        System.out.println("| Você é o nosso melhor cliente!            |");
    }
    
}
