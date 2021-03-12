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
        
        Servico servico1 = new Servico("Policia");
        Servico servico2 = new Servico("Samu");
        Servico servico3 = new Servico("Bombeiro");
        
        Comunicante comunicante1 = new Comunicante("123456789","Caio",new SimpleDateFormat("1995,09,01"),loc,contato);
        
        Veiculo veiculo1 = new Veiculo("askjd98sa",TipoVeiculo.VIATURA,"edus-0923",servico1);
        Veiculo veiculo2 = new Veiculo("bsdaj23ff",TipoVeiculo.AMBULANCIA,"edss-0923",servico2);
        Veiculo veiculo3 = new Veiculo("asfdsfdse",TipoVeiculo.CAMINHAOBOMBEIRO,"edus-0823",servico3);
        
        //Método Fábrica
        DiretorChamado criaChamado = new DiretorChamado();      
        Chamado chamado1 = criaChamado.chamaPolicia(1,"A",new SimpleDateFormat("2020,01,01"),"Teste chamado Policia",servico1,loc,veiculo1,comunicante1);          
        Chamado chamado2 = criaChamado.chamaBombeiro(2,"B",new SimpleDateFormat("2020,01,01"),"Teste chamado Bombeiro",servico3, loc, veiculo3, comunicante1);
        Chamado chamado3 = criaChamado.chamaSamu(3,"C",new SimpleDateFormat("2020,01,01"),"Teste chamado Samu",servico2, loc, veiculo2, comunicante1); 
        
        //Método Observer
        Atendente atendente1 = new Atendente("a","b",new SimpleDateFormat("2020,01,01"));
        Atendente atendente2 = new Atendente("a","b",new SimpleDateFormat("2020,01,01"));
        Comunicante comunciante = new Comunicante("c","d",new SimpleDateFormat("2020,01,01"),loc,contato);
        
        GerenciadorConversas gerenciador = new GerenciadorConversas();
        gerenciador.addObserver(atendente1);
        gerenciador.addObserver(atendente2);
        
        gerenciador.criarNovaConversa(comunciante);
        
        //Protótipo
        Chamado  chamadoClone1 = (Chamado) chamado1.clone();
        chamadoClone1.setServico(servico2);
        System.out.println("Chamado 1: "+ chamado1.getServico().getNome());
        System.out.println("Clone 1: "+ chamadoClone1.getServico().getNome());
    }    
}
