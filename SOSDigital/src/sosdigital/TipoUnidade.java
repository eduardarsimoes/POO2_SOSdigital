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
public enum TipoUnidade {
    HOSPITAL("Hospital"), DELEGACIA("Delegacia"), CORPODEBOMBEIROS("Corpo de Bombeiros");
    
    public String unidade;
    
    TipoUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public String getUnidade(){
        return unidade;
    }
}
