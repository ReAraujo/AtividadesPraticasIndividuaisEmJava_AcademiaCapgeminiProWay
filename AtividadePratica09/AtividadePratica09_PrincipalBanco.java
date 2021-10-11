import java.util.Scanner;

public class AtividadePratica09_PrincipalBanco {
    static Scanner sc = new Scanner(System.in);
    static CalculadoraTaxas calcTaxas = new CalculadoraTaxas();
    static double taxasTransferencia = 0;
    static double taxasSaques = 0;
    public static void main(String[] args) {
        
        boolean continua;
        do{
            int op = menu();
            opcoes_menu(op);
            continua = retornaMenu();    
        }while(continua);

        System.out.printf("O valor de todas as taxas cobradas foi de R$ %.4f, sendo R$ %.4f de transferências e R$ %.4f de saques.\n", 
            taxasTransferencia + taxasSaques, taxasTransferencia, taxasSaques);
        System.out.println();
    
    }
    static boolean retornaMenu(){
        boolean resposta = false;
        char resposta_continua;
        
        do{
            System.out.println("Deseja voltar ao menu? (S/N)");
                resposta_continua = sc.nextLine().toUpperCase().charAt(0);
                
                if(resposta_continua == 'S'){
                    resposta = true;
                }
                else if(resposta_continua == 'N'){
                    System.out.println("Até mais!");
                    resposta = false;
                }
                else{
                    System.out.println("Opção inválida. Digite (S/N)!");
                }
        }while(resposta_continua != 'S' && resposta_continua != 'N');  

        return resposta;    
    }

    static void opcoes_menu(int opcao){
        switch(opcao){
            case 1:
                System.out.println("================== Transferências ==================");
                double taxaT = transferencia();
                taxasTransferencia += taxaT;
                System.out.printf("\nO valor da taxa de transferência foi %.4f\n\n", taxaT);
            break;
            case 2:
                System.out.println("================== Saques ==================");
                double taxaS = saque();
                taxasSaques += taxaS;
                System.out.printf("\nO valor de taxa de saque foi %.2f.\n\n", taxaS);
            break;
        }
    }

    static int menu(){
        int opcao;
        do{
            System.out.println("\n=============== Calculadora de Taxas ===============\n");
            System.out.println("\t1 - Taxa Transferência\n\t2 - Taxa Saque");
            System.out.println("====================================================");
            System.out.print("Escolha uma opção do menu: ");
            opcao = Integer.parseInt(sc.nextLine());
            if(opcao < 1 || opcao > 2){
                System.out.println("Opção inválida. Digite novamente.");
            }
        }while(opcao < 1 || opcao > 2);    
        return opcao;
    }
    static double transferencia(){
        System.out.print("Digite o valor a ser transferido: ");
        double valor = Double.parseDouble(sc.nextLine());
        double taxaT = calcTaxas.calculaTaxaTransferencia(valor);
        return taxaT;
    }

    static double saque(){
        System.out.print("Digite o valor a ser sacado: ");
        double valor = Double.parseDouble(sc.nextLine());
        double taxaS = calcTaxas.calculaTaxaSaque(valor);
        return taxaS;
    }
    
}
