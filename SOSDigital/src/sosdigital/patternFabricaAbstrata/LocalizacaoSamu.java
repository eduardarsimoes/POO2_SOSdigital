/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.patternFabricaAbstrata;

import sosdigital.Localizacao;

/**
 *
 * @author eduarda
 */
public class LocalizacaoSamu implements EnvioLocalizacao{

    @Override
    public void envio(Localizacao localizacao) {
        System.out.println("Envio locacalizacao SAMU: " + localizacao.getEndereco());
    }
    
}
