/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital;

import java.text.SimpleDateFormat;

/**
 *
 * @author mayke
 */
public class Comunicante extends Usuario implements Cloneable{
    private Localizacao localizacao;
    private Contato contato; 
    
    public Comunicante (String cpf, String nome, SimpleDateFormat data_nascimento, Localizacao localizacao, Contato contato) {
        super( cpf, nome, data_nascimento);
        this.localizacao = localizacao;
        this.contato = contato;
    }

    public void setLocalizacao(Localizacao localizacao){
        this.localizacao = localizacao;
    }
    
    public Localizacao getLocalizacao(){
        return localizacao;
    }

    public void setContato(Contato contato){
        this.contato = contato;
    }
    
    public Contato getContato(){
        return contato;
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
