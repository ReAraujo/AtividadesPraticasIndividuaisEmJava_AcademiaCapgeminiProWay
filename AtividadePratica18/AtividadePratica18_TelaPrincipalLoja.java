/* - Crie uma classe Tela Principal Loja que contenha um método main.
   - Nesta classe, crie um objeto da Produto, realize a chamada a todos os métodos set e get, 
     ao final da execução, imprima o valor de todos os atributos da classe.
*/
package AtividadePratica18;

public class AtividadePratica18_TelaPrincipalLoja {
    public static void main(String[] args) {
        Produto p1 =  new Produto();

        p1.setCodigo(324578);
        int cod = p1.getCodigo();

        p1.setNome("Processador Intel");
        String nom = p1.getNome(); 

        p1.setDescricao("Core i7");
        String desc = p1.getDescricao();

        p1.setValor(2426.85);
        Double val = p1.getValor();


        cabecalhoLoja();
        System.out.println("| Informações do produto:      |");
        System.out.println("|                              |");
        System.out.printf("|  Código: %d              |", cod);
        System.out.printf("\n|  Nome: %s     |",nom);
        System.out.printf("\n|  Descrição: %s          |",desc);
        System.out.printf("\n|  Valor: R$ %.2f           |",val);
        encerramentoLoja();

    }
    static void cabecalhoLoja(){
        System.out.println("*------------------------------*");
        System.out.println("|    RV - Technology Store     |");
        System.out.println("*------------------------------*");
    }
    static void encerramentoLoja(){
        System.out.print("\n*------------------------------*");
    }

    
}
