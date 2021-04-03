package sosdigital.patternFabricaAbstrata;

/**
 *
 * @author eduarda
 */
public class FabricaPolicia extends FabricaAbstrataLocalizacaoVeiculo {

    @Override
    public EnvioLocalizacao criaEnvioLocalizacao() {
        return new LocalizacaoPolicia();
    }

    @Override
    public SolicitacaoVeiculo criaSolicitacaoVeiculo() {
        return new VeiculoPolicia();
    }
    
}
