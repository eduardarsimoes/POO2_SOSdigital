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
public class Localizacao {
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int latitude;
    private int longitude;
    
    public Localizacao ( String endereco, int numero, String bairro, String cidade, String estado, int latitude, int longitude){
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return bairro;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }

    public void setLatitude(int latitude){
        this.latitude = latitude;
    }
    
    public int getLatitude(){
        return latitude;
    }

    public void setLongitude(int longitude){
        this.longitude = longitude;
    }
    
    public int getLongitude(){
        return longitude;
    }

}
