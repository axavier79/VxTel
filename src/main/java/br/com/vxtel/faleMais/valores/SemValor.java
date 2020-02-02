package br.com.vxtel.faleMais.valores;

import br.com.vxtel.faleMais.DadosParaCalculo;

/**
 *
 * @author axavi
 */
public class SemValor implements OrigemDestino {

    @Override
    public double retornarValor(DadosParaCalculo dadosParaCalculo) {
        return 0;
    }

    @Override
    public void setProximoValor(OrigemDestino proximoValor) {
        // NÃO TEM PRÓXIMO, ESTE É O ÚLTIMO MÉTODO
    }

}
