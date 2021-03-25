package sosdigital.Builder;

import java.text.SimpleDateFormat;
import sosdigital.Chamado;
import sosdigital.ChamadoBombeiros;
import sosdigital.ChamadoPolicia;
import sosdigital.ChamadoSamu;
import sosdigital.Comunicante;
import sosdigital.Localizacao;
import sosdigital.Servico;
import sosdigital.Singleton.ProtocolNumberGenerator;
import sosdigital.Veiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class DiretorChamado {
    
    public Chamado chamaPolicia(String chave, SimpleDateFormat data, String descricao, Servico servico, Localizacao localizacao, Veiculo veiculo, Comunicante comunicante){
        Chamado novoChamado = new ChamadoPolicia();
        
        //Singleton
        ProtocolNumberGenerator generator = ProtocolNumberGenerator.getInstance();
        
        ChamadoPoliciaBuilder chamadoBuilder = new ChamadoPoliciaBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(generator.getNextNumber());
        chamadoBuilder.adicionarChave(chave);
        chamadoBuilder.adicionarData(data);
        chamadoBuilder.adicionarDescricao(descricao);
        chamadoBuilder.adicionarServico(servico);
        chamadoBuilder.adicionarLocalizacao(localizacao);
        chamadoBuilder.adicionarVeiculo(veiculo);
        chamadoBuilder.adicionarComunicante(comunicante);
        novoChamado.transferirChamado();
        
        return novoChamado;
    }
    
    public Chamado chamaSamu(String chave, SimpleDateFormat data, String descricao, Servico servico, Localizacao localizacao, Veiculo veiculo, Comunicante comunicante){
        Chamado novoChamado = new ChamadoSamu();
        
        //Singleton
        ProtocolNumberGenerator generator = ProtocolNumberGenerator.getInstance();
        
        ChamadoSamuBuilder chamadoBuilder = new ChamadoSamuBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(generator.getNextNumber());
        chamadoBuilder.adicionarChave(chave);
        chamadoBuilder.adicionarData(data);
        chamadoBuilder.adicionarDescricao(descricao);
        chamadoBuilder.adicionarServico(servico);
        chamadoBuilder.adicionarLocalizacao(localizacao);
        chamadoBuilder.adicionarVeiculo(veiculo);
        chamadoBuilder.adicionarComunicante(comunicante);
        novoChamado.transferirChamado();
        
        return novoChamado;
    }
    public Chamado chamaBombeiro(String chave, SimpleDateFormat data, String descricao, Servico servico, Localizacao localizacao, Veiculo veiculo, Comunicante comunicante){
        Chamado novoChamado = new ChamadoBombeiros();
        
        //Singleton
        ProtocolNumberGenerator generator = ProtocolNumberGenerator.getInstance();
        
        ChamadoBombeiroBuilder chamadoBuilder = new ChamadoBombeiroBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(generator.getNextNumber());
        chamadoBuilder.adicionarChave(chave);
        chamadoBuilder.adicionarData(data);
        chamadoBuilder.adicionarDescricao(descricao);
        chamadoBuilder.adicionarServico(servico);
        chamadoBuilder.adicionarLocalizacao(localizacao);
        chamadoBuilder.adicionarVeiculo(veiculo);
        chamadoBuilder.adicionarComunicante(comunicante);
        novoChamado.transferirChamado();
        
        return novoChamado;
    }
}
