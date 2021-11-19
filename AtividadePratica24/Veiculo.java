package AtividadePratica24_HerançaEConversaoObjetosDeClasse;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "\n\t===== Veículo =====" + 
            "\nMarca: " + this.marca + 
            "\nModelo: " + this.modelo + 
            "\nNumeração Placa: " + this.placa;
    }
}