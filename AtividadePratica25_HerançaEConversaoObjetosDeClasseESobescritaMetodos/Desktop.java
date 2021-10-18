public class Desktop extends Computador {
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "\nMarca: " + this.marca + 
               "\nMemória Ram: " + this.memoriaRam + 
               "\nProcessador: " + this.processador + 
               "\nDisco rígido: " + this.discoRigido +
               "\nTamanho gabinete: " + this.tamanhoGabinete + 
               "\nMonitor externo: " + this.monitorExterno + 
               "\nFonte: " + this.fonte;               
    }
}
