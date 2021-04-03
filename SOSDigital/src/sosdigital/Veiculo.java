/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital;

import sosdigital.enumTipos.TipoVeiculo;

/**
 *
 * @author mayke
 */
public class Veiculo implements Cloneable{
    
    private String chassi;
    private TipoVeiculo veiculo;
    private String placa;
    private Servico servico;
    
    public Veiculo(String chassi, TipoVeiculo veiculo, String placa, Servico servico ){
        this.chassi = chassi;
        this.veiculo = veiculo;
        this.placa = placa;
        this.servico = servico;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String getChassi(){
        return chassi;
    }

    public void setVeiculo(TipoVeiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public TipoVeiculo getVeiculo(){
        return veiculo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return placa;
    }

    public void setServico(Servico servico){
        this.servico = servico;
    }
    
    public Servico getServico(){
        return servico;
    }
    
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
            
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
    
}
