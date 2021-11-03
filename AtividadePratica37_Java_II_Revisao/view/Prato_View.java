package view;

import controller.BaseRepository_Controller;
import model.Prato;

public class Prato_View {
    public static void main(String[] args) {
        BaseRepository_Controller baseController = new BaseRepository_Controller(); 
        Prato prato1 = new Prato();
        prato1.id = "0001";
        prato1.profundidadePrato = "Raso";
        prato1.formatoPrato = "Redondo";
        prato1.corPrato = "Preto";
        prato1.materialPrato = "Vidro temperado";


        baseController.create(prato1);
        System.out.println(baseController.read());

    }
    
}
