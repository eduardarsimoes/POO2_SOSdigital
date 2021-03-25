/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.Builder;

import sosdigital.Chamado;

/**
 *
 * @author Andre
 */
public class ChamadoSamuBuilder extends ChamadoBuilder{
    
    public ChamadoSamuBuilder(Chamado novoChamado){
        this.chamado = novoChamado;
    } 
    
    public void criaChamadoSamu(){
        System.out.println("Chamado Samu criado");

    }
}