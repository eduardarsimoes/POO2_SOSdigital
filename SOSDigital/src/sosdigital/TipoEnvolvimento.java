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
public enum TipoEnvolvimento {
    VITIMA("Vítima"), COMUNICANTE("Comunicante");
    
    public String envolvimento;
    
    TipoEnvolvimento(String envolvimento) {
        this.envolvimento = envolvimento;
    }
    
    public String getTipoEnvolvimento(){
        return envolvimento;
    }
}
