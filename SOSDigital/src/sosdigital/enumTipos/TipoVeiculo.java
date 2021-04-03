/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.enumTipos;

/**
 *
 * @author mayke
 */
public enum TipoVeiculo {
    VIATURA("Viatura policial"), AMBULANCIA("Ambulância"), CAMINHAOBOMBEIRO("Caminhão de bombeiros");
    
    public String veiculo;
    
    TipoVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    public String getVeiculo(){
        return veiculo;
    }
}
