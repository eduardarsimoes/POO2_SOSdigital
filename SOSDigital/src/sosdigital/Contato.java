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
public class Contato {
    private static int geraid = 0;
    private int id;
    private int telefone; // um telefone ou mais de um?
    private String email;
    //private Comunicante comunicante //um contato sera associado a um comunicante?
    
    public Contato (int telefone, String email){
        this.id = ++geraid;
        this.telefone = telefone;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getTelefone(){
        return telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
}
