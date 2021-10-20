public class Pessoa{
    public String nome;
    public String sobrenome;
    public String idade;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa){
            Pessoa outraPessoa = (Pessoa)obj;
            if(this.nome.equals(outraPessoa.nome) && this.sobrenome.equals(outraPessoa.sobrenome) && this.idade.equals(outraPessoa.idade)){
                return true;
            }
        }    
        return false;
    }

    @Override
    public String toString() {
        return "\n|-------------------- Pessoa --------------------|" + 
               "\n\tNome completo: " + this.nome + " " + this.sobrenome +
               "\n\tIdade: " + this.idade;
    }



}