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
public class Atendente extends Usuario { 
    
    public Atendente (String cpf, String nome, SimpleDateFormat data_nascimento) {
        super( cpf, nome, data_nascimento);
    }

}
