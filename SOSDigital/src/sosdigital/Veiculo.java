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
public class Veiculo {
    
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
    
}
