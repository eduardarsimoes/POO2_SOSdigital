package sosdigital.patternFabricaAbstrata;

import sosdigital.Veiculo;

/**
 *
 * @author eduarda
 */
public class VeiculoBombeiro implements SolicitacaoVeiculo {

    @Override
    public boolean solicitar(Veiculo veiculo) {
        System.out.println("Solicitando veículo bombeiro. placa: " + veiculo.getPlaca());
        return true;
    }
    
}
