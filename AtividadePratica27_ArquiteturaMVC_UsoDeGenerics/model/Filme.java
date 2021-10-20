package model;

public class Filme {
    public int id;
    public String titulo;
    public String diretor;
    public String dataLancamento;
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
        String impressao1 = "\n\tTítulo: " + this.titulo +
                            "\n\tDiretor(es): " + this.diretor +
                            "\n\tData de lançamento: " + this.dataLancamento +
                            "\n\tGênero: " + this.genero;
        return impressao1;        
    }



    
}