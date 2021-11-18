package AtividadePratica25_HerançaEConversaoObjetosDeClasseESobescritaMetodos;

public class Desktop extends Computador {
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "\n|---------- Computador: Desktop ----------|" + 
               "\n\tMarca: " + this.marca + 
               "\n\tMemória Ram: " + this.memoriaRam + 
               "\n\tProcessador: " + this.processador + 
               "\n\tDisco rígido: " + this.discoRigido +
               "\n\tTamanho gabinete: " + this.tamanhoGabinete + 
               "\n\tMonitor externo: " + this.monitorExterno + 
               "\n\tFonte: " + this.fonte;               
    }
}
