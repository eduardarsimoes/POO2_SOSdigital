/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital;

import sosdigital.enumTipos.TipoUnidade;

/**
 *
 * @author mayke
 */
public class Unidade {
    private static int geraid = 0;
    private int id;
    private String nome;
    private TipoUnidade unidade;
    private Localizacao localizacao;
    private Servico servico;
    
    public Unidade ( int id, String nome, TipoUnidade unidade, Localizacao localizacao, Servico servico ){
        this.id = ++geraid;
        this.nome = nome;
        this.unidade = unidade;
        this.localizacao = localizacao;
        this.servico = servico;
    }
    
    public int getId() {
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public void setUnidade(TipoUnidade unidade){
        this.unidade = unidade;
    }
    
    public TipoUnidade getUnidade(){
        return unidade;
    }
    public void setLocalizacao(Localizacao localizacao){
        this.localizacao = localizacao;
    }
    
    public Localizacao getLocalizacao(){
        return localizacao;
    }
    public void setServico(Servico servico){
        this.servico = servico;
    }
    
    public Servico getServico(){
        return servico;
    }

}
