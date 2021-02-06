package sosdigital;

import java.text.SimpleDateFormat;

public abstract class Chamado {
    private int protocolo;
    private String chave;
    private SimpleDateFormat data;
    private String descricao;
    private String situacao; //ver se é melhor retornar o TipoSituacao ou a String
    private String envolvimento; //ver se é melhor retornar o TipoEnvolvimento ou a String
    private String prioridade; //ver se é melhor retornar o TipoPrioridade ou a String
    private Localizacao localizacao;
    private Comunicante comunicante;
    private Servico servico;
    private Veiculo veiculo;
    
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
    
    public void setSituacaoChamado(String situacao){
        this.situacao = situacao;
    }
    
    public String getSituacaoChamado(){
        return situacao;
    }
    
    public void setTipoEnvolvimento(String envolvimento){
        this.envolvimento = envolvimento;
    }
    
    public String getTipoEnvolvimento(){
        return envolvimento;
    }
    
    public void setTipoPrioridade(String prioridade){
        this.prioridade = prioridade;
    }
    
    public String getTipoPrioridade(){
        return prioridade;
    }
    
    public void setLocalizacao(Localizacao localizacao){
        this.localizacao = localizacao;
    }
    
    public Localizacao getLocalizacao(){
        return localizacao;
    }
    
    public void setComunicante(Comunicante comunicante){
        this.comunicante = comunicante;
    }
    
    public Comunicante getComunicante(){
        return comunicante;
    }
    
    public void setServico(Servico servico){
        this.servico = servico;
    }
    
    public Servico getServico(){
        return servico;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public Veiculo getVeiculo(){
        return veiculo;
    }

    public abstract void transferirChamado();
}