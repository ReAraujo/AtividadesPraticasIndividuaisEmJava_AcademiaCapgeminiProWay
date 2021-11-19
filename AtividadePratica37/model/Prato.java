package AtividadePratica37_Java_II_Revisao.model;

public class Prato extends Base{
    public String profundidadePrato;
    public String formatoPrato;
    public String corPrato;
    public String materialPrato;

    @Override
    public String toString() {
        String impressao =  "\nPratos - Dados:" + 
                            super.toString() + 
                            "\n\tProfundidade: " + this.profundidadePrato +
                            "\n\tFormato: " + this.formatoPrato +
                            "\n\tCor: " + this.corPrato +
                            "\n\tMaterial: " + this.materialPrato;
        return impressao;
    }    
}