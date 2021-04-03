package sosdigital.patternBuilder;

import java.text.SimpleDateFormat;
import sosdigital.chamados.Chamado;
import sosdigital.pessoa.Comunicante;
import sosdigital.Localizacao;
import sosdigital.Servico;
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
public abstract class ChamadoBuilder {
    Chamado chamado;
    
    public void adicionarProtocolo(int protocolo){
        chamado.setProtocolo(protocolo);
    }
    
    public void adicionarChave(String chave){
        chamado.setChave(chave);
    }
    
    public void adicionarData(SimpleDateFormat data){
        chamado.setData(data);
    }
    
    public void adicionarDescricao(String descricao){
        chamado.setDescricao(descricao);
    }

    //adicionar situacao
    //adicionar envolvimento
    //adicionar prioridade
    
    public void adicionarLocalizacao(Localizacao localizacao){
        chamado.setLocalizacao(localizacao);
    }
    
    public void adicionarComunicante(Comunicante comunicante){
        chamado.setComunicante(comunicante);
    }
    
    public void adicionarVeiculo(Veiculo veiculo){
        chamado.setVeiculo(veiculo);
    }
    
    public void adicionarServico(Servico servico){
        chamado.setServico(servico);
    }
}
