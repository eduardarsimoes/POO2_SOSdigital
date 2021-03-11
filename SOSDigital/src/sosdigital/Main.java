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
        Localizacao loc = new Localizacao("a",1,"b","c","d",2,3);
        Contato contato = new Contato(27,"123");
        //Método Fábrica
        DiretorChamado criaChamado = new DiretorChamado();      
        Chamado chamado1 = criaChamado.chamaPolicia(1,"A",new SimpleDateFormat("2020,01,01"),"Teste chamado Policia");          
        Chamado chamado2 = criaChamado.chamaBombeiro(2,"B",new SimpleDateFormat("2020,01,01"),"Teste chamado Bombeiro");
        Chamado chamado3 = criaChamado.chamaSamu(3,"C",new SimpleDateFormat("2020,01,01"),"Teste chamado Samu"); 
        
        //Método Observer
        Atendente atendente1 = new Atendente("a","b",new SimpleDateFormat("2020,01,01"));
        Atendente atendente2 = new Atendente("a","b",new SimpleDateFormat("2020,01,01"));
        Comunicante comunciante = new Comunicante("c","d",new SimpleDateFormat("2020,01,01"),loc,contato);
        
        GerenciadorConversas gerenciador = new GerenciadorConversas();
        gerenciador.addObserver(atendente1);
        gerenciador.addObserver(atendente2);
        
        gerenciador.criarNovaConversa(comunciante);
        
        
        
    }    
}
