package sosdigital.chamados;

import sosdigital.patternObserver.Observable;
import java.util.ArrayList;
import sosdigital.pessoa.Atendente;
import sosdigital.pessoa.Comunicante;

public class ConversaChamado extends Observable{
    private ArrayList<String> msg = new ArrayList();
    private Atendente atendente;
    private Comunicante comunicante;
    
    public void setNovaConversa(String texto){
        msg.add(texto);
    }
    
    public Comunicante getComunicante(){
        return comunicante;
    }
    
    public void setComunicante(Comunicante comunicante){
        this.comunicante = comunicante;
        notifyObserver();
    }
    
    public Atendente getAtendente(){
        return atendente;
    }
    
    public void setAtendente(Atendente atendente){
        this.atendente = atendente;
    }
}
