package model;

public class Filme {
    public String id;
    public String titulo;
    public String diretor;
    public long anoLancamento;
    public String genero;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filme){
            Filme outro = (Filme)obj;
            if(this.id == outro.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String impressao1 = "\n\tID: " + this.id + 
                            "\n\tTítulo: " + this.titulo +
                            "\n\tDiretor(es): " + this.diretor +
                            "\n\tAno de lançamento: " + this.anoLancamento +
                            "\n\tGênero: " + this.genero;
        return impressao1;        
    }



    
}