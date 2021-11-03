package view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("dados/leitura2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("Mussum Ipsum, cacilds vidis litro abertis.");
            bw.write("\nCevadis im ampola pa arma uma pindureta.");
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Desculpe, não foi possível encontrar o arquivo.");                    
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo!");
        }


        
    }
    
}
