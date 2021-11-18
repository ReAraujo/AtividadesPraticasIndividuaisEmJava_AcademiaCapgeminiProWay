/* - Crie uma nova classe para esta atividade e que possua um método main para executar a aplicação
   - Construa uma classe Pessoa que possua as propriedades nome, sobrenome e idade 
   - Na classe principal, dentro do metodo main, construa dois objetos da classe pessoa e preencha com valores diferentes para cada objeto
   - Ao final da execução do método main, imprima todos os dados das duas pessoas 
*/
package AtividadePratica15;

public class ClassePrincipal {
    public static void main(String[] args) {

        cabecalho();

        ClassePessoa pessoa1 = new ClassePessoa();
        pessoa1.nome = "Renata";
        pessoa1.sobrenome = "Tozatti";
        pessoa1.idade = 31;

        ClassePessoa pessoa2 = new ClassePessoa();
        pessoa2.nome = "Jaqueline";
        pessoa2.sobrenome = "Setti";
        pessoa2.idade = 28;
        
        System.out.printf("\n========== Cadastro da primeira pessoa ===========");
        System.out.printf("\nNome: %s.", pessoa1.nome);
        System.out.printf("\nSobrenome: %s.", pessoa1.sobrenome);
        System.out.printf("\nIdade: %d.", pessoa1.idade);

        System.out.printf("\n========== Cadastro da segunda pessoa ===========");
        System.out.printf("\nNome: %s.", pessoa2.nome);
        System.out.printf("\nSobrenome: %s.", pessoa2.sobrenome);
        System.out.printf("\nIdade: %d.", pessoa2.idade);

        encerramento_programa();
    }
    
    static void cabecalho(){
        System.out.print("=============== Seja bem-vindo(a)! ===============");
    }
    static void encerramento_programa(){
        System.out.printf("\n=================================================");
        System.out.printf("\nEste programa está sendo encerrado em 3.. 2.. 1.");
    }  
}
