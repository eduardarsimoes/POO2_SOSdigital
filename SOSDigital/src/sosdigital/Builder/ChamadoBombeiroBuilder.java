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
public class ChamadoBombeiroBuilder extends ChamadoBuilder{
    
    public ChamadoBombeiroBuilder(Chamado novoChamado){
        this.chamado = novoChamado;
    } 
    
    public void criaChamadoBombeiro(){
        System.out.println("Chamado Bombeiro criado");
    }
}
