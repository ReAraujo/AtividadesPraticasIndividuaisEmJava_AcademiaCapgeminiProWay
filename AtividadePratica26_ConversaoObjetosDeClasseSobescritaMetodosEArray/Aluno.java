public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno){
            Aluno outroAluno = (Aluno)obj;
            if(this.matricula.equals(outroAluno.matricula) && this.turma.equals(outroAluno.turma) && this.curso.equals(outroAluno.curso)){
                return true;
            }
        }    
        return false;
    }
    
    @Override
    public String toString() {
        return "\n|-------------------- Aluno --------------------|" + 
               "\n\tNome completo: " + this.nome + " " + this.sobrenome +
               "\n\tIdade: " + this.idade +
               "\n\tMatrícula: " + this.matricula +
               "\n\tTurma: " + this.turma +
               "\n\tCurso: " + this.curso;
    }
}
