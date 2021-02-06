/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital;

/**
 *
 * @author mayke
 */
public enum TipoPrioridade {
    ALERTAVERMELHO("Alerta vermelho"), ALTA("Alta"), MEDIA("Média"), BAIXA("Baixa");
    
    public String prioridade;
    
    TipoPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    public String getTipoPrioridade(){
        return prioridade;
    }
}
