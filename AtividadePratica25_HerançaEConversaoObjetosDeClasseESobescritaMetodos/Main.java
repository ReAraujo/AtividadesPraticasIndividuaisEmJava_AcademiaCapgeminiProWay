/*_  Crie uma classe computador com atributos públicos: marca, memoria ram, processador e disco rigido. - OK!
  _  Crie uma classe notebook que herda de computador com os atributos públicos: bateria, velocidade wifi e versão bluetooth. - OK!
  _  Crie uma classe desktop que herda de computador com os atributos públicos: tamanho gabinete, monitor externo e fonte. - OK!
  _  Crie uma sobrescrita do método toString nas três classes para imprimir todos os dados.  - OK!
  _  Crie uma classe Main com um método main. - OK!
  _  Crie um objeto da classe Computador, um da classe Notebook, um da classe Desktop e atribua valores para as propriedade de cada objeto.  - OK!
  _  Crie um objeto da classe Object através da instância da classe Computador.
  _  Crie um objeto da classe Object através da instância da classe Notebook.
  _  Crie um objeto da classe Object através da instância da classe Desktop.
  _  Converta o primeiro objeto da Object novamente para um novo objeto da classe Computador.
  _  Converta o segundo objeto da Object novamente para um novo objeto da classe Notebook.
  _  Converta o terceiro objeto da Object novamente para um novo objeto da classe Desktop.
  _  Imprima todos dos dados do objeto de Computador convertido através do toString.
  _  Imprima todos dos dados do objeto de Notebook convertido através do toString.
  _  Imprima todos dos dados do objeto de Desktop convertido através do toString.
*/
package AtividadePratica25_HerançaEConversaoObjetosDeClasseESobescritaMetodos;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "NZXT S340";
        computador1.memoriaRam = "8Gb";
        computador1.processador = "Intel Core i7";
        computador1.discoRigido = "HD 1Tb Toshiba";

        Notebook notebook1 = new Notebook();
        notebook1.marca = "Dell";
        notebook1.memoriaRam = "16Gb";
        notebook1.processador = "Intel Core i7";
        notebook1.discoRigido = "SSD 512Gb NVME M.2";
        notebook1.bateria = "abc";
        notebook1.velocidadeWifi = "802.11"; 
        notebook1.versaoBluetooth = "abc";

        Desktop desktop1 = new Desktop();
        desktop1.marca = "NZXT H210";
        desktop1.memoriaRam = "16Gb";
        desktop1.processador = "Intel Core i5";
        desktop1.discoRigido = "SSD 500Gb NVME M.2";
        desktop1.tamanhoGabinete = "Mini ITX";
        desktop1.monitorExterno = "Samsung 28\" ";
        desktop1.fonte = "Corsair RM850";

        Object obj1 = computador1;
        Object obj2 = notebook1;
        Object obj3 = desktop1;

        Computador computador2 = (Computador)obj1;
        Notebook notebook2 = (Notebook)obj2;
        Desktop desktop2 = (Desktop)obj3;

        imprimir(computador2);
        imprimir(notebook2);
        imprimir(desktop2);       

    }

    public static void imprimir(Object obj){
        System.out.println(obj);
    }
    
}
