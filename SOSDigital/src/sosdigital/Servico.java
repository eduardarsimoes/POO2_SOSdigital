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
public class Servico implements Cloneable{
    private static int geraid = 0;
    private int id;
    private String nome;
    
    public Servico (String nome){
        this.id = ++geraid;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
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
