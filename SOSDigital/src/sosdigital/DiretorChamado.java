package sosdigital;

import java.text.SimpleDateFormat;

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
    
    public Chamado chamaPolicia(int protocolo, String chave, SimpleDateFormat data, String descricao, Servico servico, Localizacao localizacao, Veiculo veiculo, Comunicante comunicante){
        Chamado novoChamado = new ChamadoPolicia();
        
        ChamadoPoliciaBuilder chamadoBuilder = new ChamadoPoliciaBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(protocolo);
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
    
    public Chamado chamaSamu(int protocolo, String chave, SimpleDateFormat data, String descricao, Servico servico, Localizacao localizacao, Veiculo veiculo, Comunicante comunicante){
        Chamado novoChamado = new ChamadoSamu();
        
        ChamadoSamuBuilder chamadoBuilder = new ChamadoSamuBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(protocolo);
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
    public Chamado chamaBombeiro(int protocolo, String chave, SimpleDateFormat data, String descricao, Servico servico, Localizacao localizacao, Veiculo veiculo, Comunicante comunicante){
        Chamado novoChamado = new ChamadoBombeiros();
        
        ChamadoBombeiroBuilder chamadoBuilder = new ChamadoBombeiroBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(protocolo);
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
