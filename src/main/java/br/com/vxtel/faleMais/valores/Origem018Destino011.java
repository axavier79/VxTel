package br.com.vxtel.faleMais.valores;

import br.com.vxtel.faleMais.DadosParaCalculo;

/**
 *
 * @author axavi
 */
public class Origem018Destino011 implements OrigemDestino {
    private OrigemDestino proximoValor;

    @Override
    public double retornarValor(DadosParaCalculo dadosParaCalculo) {
        if (dadosParaCalculo.getDddOrigem().get(0).getCodDDD().equals("018")
                && dadosParaCalculo.getDddDestino().get(0).getCodDDD().equals("011")) {
            return 1.9;
        } else {
            return proximoValor.retornarValor(dadosParaCalculo);
        }
    }

    @Override
    public void setProximoValor(OrigemDestino proximoValor) {
        this.proximoValor = proximoValor;
    }

}
