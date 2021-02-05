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
    
    public void adicionarLocalizacao(){
    }
    
    public void adicionarVitimaComunicante(){
    }
    
    public void adicionarVeiculo(){
    }
    
    public void adicionarServico(){
    }
}
