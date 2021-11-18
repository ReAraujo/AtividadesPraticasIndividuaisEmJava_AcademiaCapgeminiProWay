package AtividadePratica25_HerançaEConversaoObjetosDeClasseESobescritaMetodos;

public class Notebook extends Computador{
    public String bateria;
    public String velocidadeWifi;
    public String versaoBluetooth;

    @Override
    public String toString() {
        return "\n|---------- Computador: Notebook ----------|" + 
               "\n\tMarca: " + this.marca + 
               "\n\tMemória Ram: " + this.memoriaRam + 
               "\n\tProcessador: " + this.processador + 
               "\n\tDisco rígido: " + this.discoRigido +
               "\n\tBateria: " + this.bateria + 
               "\n\tVelocidade Wi-fi: " + this.velocidadeWifi + 
               "\n\tVersão Bluetooth: " + this.versaoBluetooth;               
    }  
}
