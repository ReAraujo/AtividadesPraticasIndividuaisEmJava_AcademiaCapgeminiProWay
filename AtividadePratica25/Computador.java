package AtividadePratica25_HerançaEConversaoObjetosDeClasseESobescritaMetodos;

public class Computador{
    public String marca;
    public String memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "\n|---------- Computador ----------|" + 
               "\n\tMarca: " + this.marca + 
               "\n\tMemória Ram: " + this.memoriaRam + 
               "\n\tProcessador: " + this.processador + 
               "\n\tDisco rígido: " + this.discoRigido;
    }
}