package sosdigital.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sosdigital.pessoa.Atendente;
import sosdigital.chamados.Chamado;
import sosdigital.pessoa.Comunicante;
import sosdigital.Contato;
import sosdigital.chamados.ConversaChamado;
import sosdigital.patternBuilder.DiretorChamado;
import sosdigital.Localizacao;
import sosdigital.Servico;
import sosdigital.enumTipos.TipoVeiculo;
import sosdigital.Veiculo;
import sosdigital.patternFabricaAbstrata.EnvioLocalizacao;
import sosdigital.patternFabricaAbstrata.FabricaAbstrataLocalizacaoVeiculo;
import sosdigital.patternFabricaAbstrata.FabricaBombeiro;
import sosdigital.patternFabricaAbstrata.FabricaPolicia;
import sosdigital.patternFabricaAbstrata.FabricaSamu;
import sosdigital.patternFabricaAbstrata.SolicitacaoVeiculo;

/**
 *
 * @author Andre
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Atendente> atendentes = new ArrayList();
        
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
        Chamado chamado1 = criaChamado.chamaPolicia("A",new SimpleDateFormat("2020,01,01"),"Teste chamado Policia",servico1,loc,veiculo1,comunicante1);          
        Chamado chamado2 = criaChamado.chamaBombeiro("B",new SimpleDateFormat("2020,01,01"),"Teste chamado Bombeiro",servico3, loc, veiculo3, comunicante1);
        Chamado chamado3 = criaChamado.chamaSamu("C",new SimpleDateFormat("2020,01,01"),"Teste chamado Samu",servico2, loc, veiculo2, comunicante1); 
        
        //Método Singleton
        System.out.println("Protocolo chamado1: "+chamado1.getProtocolo());
        System.out.println("Protocolo chamado2: "+chamado2.getProtocolo());
        System.out.println("Protocolo chamado3: "+chamado3.getProtocolo()+"\n");
        
        //Método Observer
        Atendente atendente1 = new Atendente("a","b",new SimpleDateFormat("2020,01,01"));
        Atendente atendente2 = new Atendente("a","b",new SimpleDateFormat("2020,01,01"));
        atendentes.add(atendente1);
        atendentes.add(atendente2);
        Comunicante comunicante = new Comunicante("c","d",new SimpleDateFormat("2020,01,01"),loc,contato);
        
        ConversaChamado conversa = new ConversaChamado();
        atendentes.forEach((a) -> {
            conversa.addObserver(a);
        });
        
        conversa.setComunicante(comunicante);
        
        //Protótipo
        Chamado  chamadoClone1 = (Chamado) chamado1.clone();
        chamadoClone1.setServico(servico2);
        System.out.println("Chamado 1: "+ chamado1.getServico().getNome());
        System.out.println("Clone 1: "+ chamadoClone1.getServico().getNome());
        
        //Fábrica Abstrata
        
        String escolha = JOptionPane.showInputDialog("Solicitar qual veículo? ");
        FabricaAbstrataLocalizacaoVeiculo fabrica = null;
        
        Veiculo v = null;
        
        if (escolha.equalsIgnoreCase("p")){
            fabrica = new FabricaPolicia();
            v = new Veiculo("askjd98sa",TipoVeiculo.VIATURA,"edus-0923",servico1);
        } else if (escolha.equalsIgnoreCase("s")) {
            fabrica = new FabricaSamu();
            v = new Veiculo("bsdaj23ff",TipoVeiculo.AMBULANCIA,"edss-0923",servico2);
        } else {
            fabrica = new FabricaBombeiro();
            v = new Veiculo("asfdsfdse",TipoVeiculo.CAMINHAOBOMBEIRO,"edus-0823",servico3);
        }
        
        SolicitacaoVeiculo solicitacao = fabrica.criaSolicitacaoVeiculo();
        if(solicitacao.solicitar(v)){
            EnvioLocalizacao envio = fabrica.criaEnvioLocalizacao();
            envio.envio(loc);
        }
    }    
}
