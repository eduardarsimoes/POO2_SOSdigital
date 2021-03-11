package sosdigital;

import java.util.ArrayList;

public class ConversaChamado{
    private ArrayList<String> msg = new ArrayList();
    private Atendente atendente;
    private Comunicante comunicante;
    
    public ConversaChamado(Comunicante comunicante){
        this.comunicante = comunicante;
    }
    
    public void setNovaConversa(String texto){
        msg.add(texto);
    }
    
    public Comunicante getComunicante(){
        return comunicante;
    }
    
    public void setComunicante(Comunicante comunicante){
        this.comunicante = comunicante;
    }
    
    public Atendente getAtendente(){
        return atendente;
    }
    
    public void setAtendente(Atendente atendente){
        this.atendente = atendente;
    }
}
