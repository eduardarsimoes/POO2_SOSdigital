/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.patternFabricaAbstrata;

import sosdigital.Veiculo;

/**
 *
 * @author eduarda
 */
public class VeiculoSamu implements SolicitacaoVeiculo {

    @Override
    public boolean solicitar(Veiculo veiculo) {
        System.out.println("Solicitando veículo Samu. placa: " + veiculo.getPlaca());
        return true;
    }
    
}
