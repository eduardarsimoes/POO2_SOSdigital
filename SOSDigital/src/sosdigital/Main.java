/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital;

import java.text.SimpleDateFormat;

/**
 *
 * @author Andre
 */
public class Main {
    
    public static void main(String[] args) {
        DiretorChamado criaChamado = new DiretorChamado();      
        Chamado chamado1 = criaChamado.chamaPolicia(1,"A",new SimpleDateFormat("2020,01,01"),"Teste chamado Policia");          
        Chamado chamado2 = criaChamado.chamaBombeiro(2,"B",new SimpleDateFormat("2020,01,01"),"Teste chamado Bombeiro");
        Chamado chamado3 = criaChamado.chamaSamu(3,"C",new SimpleDateFormat("2020,01,01"),"Teste chamado Samu"); 
    }    
}
