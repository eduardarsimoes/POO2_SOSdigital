package sosdigital.patternFabricaAbstrata;

import sosdigital.Veiculo;

/**
 *
 * @author eduarda
 */
public class VeiculoPolicia implements SolicitacaoVeiculo {

    @Override
    public boolean solicitar(Veiculo veiculo) {
        System.out.println("Solicitando veículo policia. placa: " + veiculo.getPlaca());
        return true;
    }
    
}
