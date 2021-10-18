public class Computador{
    public String marca;
    public String memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "\n\t========== Computador ==========" + 
            "\nMarca: " + this.marca + 
            "\nMemória Ram: " + this.memoriaRam + 
            "\nProcessador: " + this.processador + 
            "\nDisco rígido: " + this.discoRigido;
    }


}