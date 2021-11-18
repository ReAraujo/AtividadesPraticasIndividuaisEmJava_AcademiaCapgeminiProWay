package AtividadePratica20;

public class Universidade {
    public static void main(String[] args) {

        Funcionario funci1 =  new Funcionario();
        funci1.setNome("Soraia");
        funci1.setSobrenome("Ferraço");
        funci1.setMatricula(102356);
        funci1.setSalario(3589.63);
        funci1.setDepartamento("Setor de Ciências Biológicas");

        Coordenador coord1 = new Coordenador();
        coord1.setNome("Valeska");
        coord1.setSobrenome("da Silva");
        coord1.setMatricula(102389);
        coord1.setSalario(5678.96);
        coord1.setDepartamento("Setor de Ciências Exatas");
        coord1.setCurso_coordenado("Ciências da Computação");
        coord1.setBonus(1500.00);

        Aluno alun1 = new Aluno();
        alun1.setNome("Carla");
        alun1.setSobrenome("Pereira");
        alun1.setMatricula(4896);
        alun1.setCurso("Matemática");
        alun1.setTurma("A - 1");


        System.out.println("\n=============== Funcionários ===============");
        System.out.printf("Nome completo: %s %s", funci1.getNome(), funci1.getSobrenome());
        System.out.printf("\nMatrícula: %d", funci1.getMatricula());
        System.out.printf("\nSalário: R$ %.2f", funci1.getSalario());
        System.out.printf("\nDepartamento: %s", funci1.getDepartamento());
        System.out.println("\n============================================");

        System.out.println("\n============== Coordenadores ===============");
        System.out.printf("Nome completo: %s %s", coord1.getNome(), coord1.getSobrenome());
        System.out.printf("\nMatrícula: %d", coord1.getMatricula());
        System.out.printf("\nDepartamento: %s", coord1.getDepartamento());
        System.out.printf("\nCurso Coordenado: %s", coord1.getCurso_coordenado());
        System.out.printf("\nSalário: R$ %.2f", coord1.getSalario());
        System.out.printf("\nBônus: R$ %.2f", coord1.getBonus());
        System.out.printf("\nTotal Salário + Bônus = R$ %.2f", coord1.getSalario() + coord1.getBonus());
        System.out.println("\n============================================");

        System.out.println("\n================== Alunos ==================");
        System.out.printf("Nome completo: %s %s", alun1.getNome(), alun1.getSobrenome());
        System.out.printf("\nMatrícula: %d", alun1.getMatricula());
        System.out.printf("\nCurso: %s", alun1.getCurso());
        System.out.printf("\nTurma: %s", alun1.getTurma());
        System.out.println("\n============================================");
    }
    
}
