package sosdigital.patternFabricaAbstrata;

/**
 *
 * @author eduarda
 */
public abstract class FabricaAbstrataLocalizacaoVeiculo {
    public abstract EnvioLocalizacao criaEnvioLocalizacao();
    public abstract SolicitacaoVeiculo criaSolicitacaoVeiculo();
}
