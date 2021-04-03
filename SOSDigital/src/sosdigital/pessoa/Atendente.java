package sosdigital.pessoa;

import sosdigital.chamados.ConversaChamado;
import sosdigital.patternObserver.Observable;
import sosdigital.patternObserver.Observer;
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
    public void update(Observable obs) {
        ConversaChamado conversa = (ConversaChamado) obs;
        if(conversa.getAtendente() == null){
            conversa.setAtendente(this);
            
            System.out.println("DEBUG: Atendente atribuido à conversa.\n");
        }
    }

}
