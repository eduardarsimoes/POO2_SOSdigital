package sosdigital.patternFabricaAbstrata;

import sosdigital.Localizacao;

/**
 *
 * @author eduarda
 */
public class LocalizacaoSamu implements EnvioLocalizacao{

    @Override
    public void envio(Localizacao localizacao) {
        System.out.println("Enviando locacalizacao SAMU: " + localizacao.getEndereco());
    }
    
}
