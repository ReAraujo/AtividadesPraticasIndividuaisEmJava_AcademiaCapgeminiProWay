package AtividadePratica37_Java_II_Revisao.view;

import AtividadePratica37_Java_II_Revisao.controller.Prato_Controller;
import AtividadePratica37_Java_II_Revisao.model.Prato;

public class Prato_View {
    public static void main(String[] args) {
        Prato_Controller pratoController = new Prato_Controller(); 
        Prato prato1 = new Prato();
        prato1.id = "0001";
        prato1.profundidadePrato = "Raso";
        prato1.formatoPrato = "Redondo";
        prato1.corPrato = "Preto";
        prato1.materialPrato = "Vidro temperado";

        pratoController.create(prato1);
        System.out.println(pratoController.read());

    }
}
