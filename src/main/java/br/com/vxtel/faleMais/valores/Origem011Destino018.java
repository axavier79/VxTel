package br.com.vxtel.faleMais.valores;

import br.com.vxtel.faleMais.DadosParaCalculo;

/**
 *
 * @author axavi
 */
public class Origem011Destino018 implements OrigemDestino {
    private OrigemDestino proximoValor;

    @Override
    public double retornarValor(DadosParaCalculo dadosParaCalculo) {
        if (dadosParaCalculo.getDddOrigem().get(0).getCodDDD().equals("011")
                && dadosParaCalculo.getDddDestino().get(0).getCodDDD().equals("018")) {
            return 0.9;
        } else {
            return proximoValor.retornarValor(dadosParaCalculo);
        }
    }

    @Override
    public void setProximoValor(OrigemDestino proximoValor) {
        this.proximoValor = proximoValor;
    }

}
