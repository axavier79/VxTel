package br.com.vxtel.faleMais.valores;

import br.com.vxtel.faleMais.DadosParaCalculo;

/**
 *
 * @author axavi
 */
public class Origem016Destino011 implements OrigemDestino {
    private OrigemDestino proximoValor;

    @Override
    public double retornarValor(DadosParaCalculo dadosParaCalculo) {
        if (dadosParaCalculo.getDddOrigem().get(0).getCodDDD().equals("016")
                && dadosParaCalculo.getDddDestino().get(0).getCodDDD().equals("011")) {
            return 2.9;
        } else {
            return proximoValor.retornarValor(dadosParaCalculo);
        }
    }

    @Override
    public void setProximoValor(OrigemDestino proximoValor) {
        this.proximoValor = proximoValor;
    }

}
