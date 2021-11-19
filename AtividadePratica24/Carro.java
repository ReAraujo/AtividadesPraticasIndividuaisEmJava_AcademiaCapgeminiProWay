package AtividadePratica24_HerançaEConversaoObjetosDeClasse;

public class Carro extends Veiculo {
    public int numeroPortas;
    public int capacidadePortaMalas;

    @Override
    public String toString() {
        return "\n\t===== Carro =====" + 
            "\nMarca: " + this.marca + 
            "\nModelo: " + this.modelo + 
            "\nNumeração Placa: " + this.placa + 
            "\nNúmero de Portas: " + this.numeroPortas + 
            "\nCapacidade do Porta-malas: " + this.capacidadePortaMalas;
    }
}
