package sosdigital;

public class GerenciadorConversas extends Observable{
    
    public void criarNovaConversa(Comunicante comunicante){
        ConversaChamado conversa = new ConversaChamado(comunicante);
        notifyObserver(conversa);
    }
}
