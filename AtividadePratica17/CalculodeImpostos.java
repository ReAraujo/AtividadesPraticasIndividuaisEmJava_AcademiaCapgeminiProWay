package AtividadePratica17;

public class CalculodeImpostos {
    private double impostoISS = 0.04;
    private double impostoIOF = 0.0038;
    private double impostoIR = 0.075;


    public double calculoISS(double valor){
        double taxaISS =  valor * impostoISS;
        return taxaISS;

    }
    public double calculoIOF(double valor){
        double taxaIOF = valor * impostoIOF;
        return taxaIOF; 

    }
    public double calculoIR(double valor){
        double taxaIR = valor * impostoIR;
        return taxaIR;
    }
}
