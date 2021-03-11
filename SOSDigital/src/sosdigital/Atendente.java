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
public class Atendente extends Usuario implements Observer{ 
    
    public Atendente (String cpf, String nome, SimpleDateFormat data_nascimento) {
        super( cpf, nome, data_nascimento);
    }

    @Override
    public void update(ConversaChamado conversa) {
        if(conversa.getAtendente() == null){
            conversa.setAtendente(this);
            
            System.out.println("DEBUG: Atendente atribuido à conversa.");
        }
    }

}
