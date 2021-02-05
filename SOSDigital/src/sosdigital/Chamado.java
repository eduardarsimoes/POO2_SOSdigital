package sosdigital;

import java.text.SimpleDateFormat;

public abstract class Chamado {
    private int protocolo;
    private String chave;
    private SimpleDateFormat data;
    private String descricao;
    
    public void setProtocolo(int protocolo){
        this.protocolo = protocolo;
    }
    
    public int getProtocolo(){
        return protocolo;
    }
    
    public void setChave(String chave){
        this.chave = chave;
    }
    
    public String getChave(){
        return chave;
    }
    
    public void setData(SimpleDateFormat data){
        this.data = data;
    }
    
    public SimpleDateFormat getData(){
        return data;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public abstract void transferirChamado();
}