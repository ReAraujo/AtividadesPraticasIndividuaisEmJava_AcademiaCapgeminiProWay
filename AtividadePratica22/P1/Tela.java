/* - Crie uma classe Tela com um método main.
   - Crie na classe Tela, 2 objetos da classe Aluno, 
     chame os métodos setters para inserir valores e imprima os objetos utilizando o método toString.
*/
package AtividadePratica22.P1;

public class Tela {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome_completo("Sandra Madalena");
        a1.setIdade(45);
        a1.setMatricula("105896");

        Aluno a2 = new Aluno();
        a2.setNome_completo("João Alfredo da Silva");
        a2.setIdade(24);
        a2.setMatricula("105963");

        System.out.println(a1);    
        System.out.println(a2); 
    }    
}
