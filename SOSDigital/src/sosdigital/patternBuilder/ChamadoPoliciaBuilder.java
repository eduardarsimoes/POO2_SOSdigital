/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.patternBuilder;

import sosdigital.chamados.Chamado;

/**
 *
 * @author Andre
 */
public class ChamadoPoliciaBuilder extends ChamadoBuilder{
    
    public ChamadoPoliciaBuilder(Chamado novoChamado){
        this.chamado = novoChamado;
    } 
    
    public void criaChamadoPolicia(){
        System.out.println("Chamado Policia criado");
    }
}
