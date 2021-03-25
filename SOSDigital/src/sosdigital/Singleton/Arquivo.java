package sosdigital.Singleton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
    public static String Read(String caminho){
        String conteudo = "";
        try{
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            try{
                String linha = lerArq.readLine();
                while(linha != null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            }catch (IOException ex){
            conteudo = "Erro: Nao foi possivel ler o arquivo.";
            }
        }catch (FileNotFoundException ex){
            Write(caminho,"-1");
            return "0";
        }
        if (conteudo.contains("Erro"))
            return "";
        else
            return conteudo;
    }
    
    public static boolean Write(String caminho, String texto){
        try{
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}