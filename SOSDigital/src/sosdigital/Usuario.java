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
public class Usuario {
    private String cpf;
    private String nome;
    private SimpleDateFormat data_nascimento;

    public Usuario(String cpf, String nome, SimpleDateFormat data_nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setDataNascimento(SimpleDateFormat data_nascimento){
        this.data_nascimento = data_nascimento;
    }
    
    public SimpleDateFormat getDataNascimento(){
        return data_nascimento;
    }
    
}
