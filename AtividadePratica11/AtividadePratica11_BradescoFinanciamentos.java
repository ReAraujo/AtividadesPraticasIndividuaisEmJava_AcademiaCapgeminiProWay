/* - exiba um cabeçalho com o título “Bradesco Financiamentos”
   - exiba um menu com as opções, Crédito Pessoal, Crédito Imobiliário, Crédito Empresarial e Empréstimo Consignado
   - solicite ao usuário que escolha uma das opções do menu e caso a opção digitada não seja válida, o sistema 
     deve imprimir o menu novamente, solicitar que ele digite a opção e validar a resposta até que uma opção válida seja digitada
   - ao digitar uma opção válida o sistema deve exibir apenas uma mensagem com o nome do módulo, 
     nenhuma implementação da funcionalidade do módulo será necessária  
   - após exibir a opção correta, o sistema deve perguntar ao usuário se ele deseja voltar ao menu principal (‘V’) 
     ou sair do sistema(‘S’) 
   - O sistema deve ler a opção digitada pelo usuário e validar se ele digitou uma das opções válidas, 
     caso contrário deve solicitar que digite novamente até que uma opção válida seja digitada   
   - O sistema deve encaminhar o usuário para o menu principal caso a resposta seja ‘V’ e 
     se a opção digitada for ‘S’ o sistema deve encerrar imprimindo uma mensagem de obrigado.

*/
package AtividadePratica11;

import java.util.Scanner;

public class AtividadePratica11_BradescoFinanciamentos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    byte opcaoEscolhida;
    char continua = 'N';

    do{
        System.out.println("\n|=======================================================|");
        System.out.println("|=============== Bradesco Financiamentos ===============|");
        System.out.println("|=======================================================|");
        System.out.println("| Menu de opções:                                       |");
        System.out.println("|\t1 - Crédito Pessoal                             |");
        System.out.println("|\t2 - Crédito Imobiliário                         |");
        System.out.println("|\t3 - Crédito Empresarial                         |");
        System.out.println("|\t4 - Crédito Consignado                          |");
        System.out.println("|-------------------------------------------------------|");
        System.out.print("| Digite a opção escolhida: ");                          
        opcaoEscolhida = Byte.parseByte(sc.nextLine());

        switch(opcaoEscolhida){
            case 1: 
                System.out.println("| Opção escolhida: 1 - Crédito Pessoal");
            break;
            case 2: 
                System.out.println("| Opção escolhida: 2 - Crédito Imobiliário");
            break;
            case 3: 
                System.out.println("| Opção escolhida: 3 - Crédito Empresarial");
            break;
            case 4: 
                System.out.println("| Opção escolhida: 4 - Crédito Consignado");
            break;
            default:
                System.out.println("| A opção digitada não é válida dentre as previstas do menu!");
            break;    
        }
        if (opcaoEscolhida > 0 && opcaoEscolhida < 5){
            do{
                System.out.print("| Para voltar ao 'Menu de Opções' digite 'V' e para 'Sair do Sistema' digite 'S': ");
                continua = sc.nextLine().toUpperCase().charAt(0);
            }while(continua!='V' && continua!='S');
        }
        if (continua == 'S'){
            System.out.println("\n|=============== Bradesco Financiamentos ===============|");
            System.out.println("|======== Obrigado(a) por usar o nosso sistema! ========|");
            System.out.println("|=======================================================|");
        }
    }while (opcaoEscolhida < 1 || opcaoEscolhida > 4 || continua == 'V');

    sc.close();    
    }

}
