/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.chamados;

/**
 *
 * @author mayke
 */
public enum SituacaoChamado {
    ABERTO("Aberto"), CANCELADO("Cancelado"), VALIDADO("Validado"), SOLUCIONADO("Solucionado");
    
    public String situacao;
    
    SituacaoChamado(String situacao) {
        this.situacao = situacao;
    }
    
    public String getSituacao(){
        return situacao;
    }
}
