package sosdigital.patternFabricaAbstrata;

/**
 *
 * @author eduarda
 */
public class FabricaSamu extends FabricaAbstrataLocalizacaoVeiculo {

    @Override
    public EnvioLocalizacao criaEnvioLocalizacao() {
        return new LocalizacaoSamu();
    }

    @Override
    public SolicitacaoVeiculo criaSolicitacaoVeiculo() {
        return new VeiculoSamu();
    }
    
}
