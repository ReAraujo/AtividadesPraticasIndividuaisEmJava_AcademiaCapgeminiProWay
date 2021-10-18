public class Notebook extends Computador{
    public String bateria;
    public String velocidadeWifi;
    public String versaoBluetooth;

    @Override
    public String toString() {
        return "\nMarca: " + this.marca + 
               "\nMemória Ram: " + this.memoriaRam + 
               "\nProcessador: " + this.processador + 
               "\nDisco rígido: " + this.discoRigido +
               "\nBateria: " + this.bateria + 
               "\nVelocidade Wi-fi: " + this.velocidadeWifi + 
               "\nVersão Bluetooth: " + this.versaoBluetooth;               
    }

    
}
