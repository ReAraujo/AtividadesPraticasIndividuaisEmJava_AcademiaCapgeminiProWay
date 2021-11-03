/*_ Crie uma classe que contenha a estrutura para a leitura de um arquivo de texto, 
    o arquivo deve estar salvo em uma pasta de nome dados. Esta leitura deve conter o 
    fluxo de entrada de dados de um arquivo, um leitor de fluxo e um buffer de leitura. 
   Com o buffer, imprima as linhas do arquivo no console.
*/

package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static void main(String[] args) {

        // Fluxo de entrada através de um arquivo:    
       try {
            FileInputStream fis = new FileInputStream("dados/leitura.txt"); // entrada de bytes
            InputStreamReader isr = new InputStreamReader(fis); // leitor de Stream - converte byte para character 
            //char[] dados =  new char[90];
            //isr.read(dados, 0, 89);
            //System.out.println(dados); // leitura por character 
            BufferedReader bRead = new BufferedReader(isr); // faz o acúmulo de character para a leitura de linha ou de totalidade dele

            while(bRead.ready()){
                String texto = bRead.readLine();
                System.out.println(texto);
            }
            bRead.close();

            System.out.println("\nO arquivo foi aberto com sucesso!");
        } catch (FileNotFoundException ex) {
            System.out.println("\nO arquivo não foi encontrado.Que tal procurar novamente?");
        } catch (IOException ex) {
            System.out.println("\nDesculpe, não foi possível ler o arquivo.");
        }
         





        
    }
    
}