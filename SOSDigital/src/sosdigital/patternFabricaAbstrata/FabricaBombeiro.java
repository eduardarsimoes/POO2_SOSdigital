package sosdigital.patternFabricaAbstrata;

/**
 *
 * @author eduarda
 */
public class FabricaBombeiro extends FabricaAbstrataLocalizacaoVeiculo {

    @Override
    public EnvioLocalizacao criaEnvioLocalizacao() {
        return new LocalizacaoBombeiro();
    }

    @Override
    public SolicitacaoVeiculo criaSolicitacaoVeiculo() {
        return new VeiculoBombeiro();
    }
    
}
