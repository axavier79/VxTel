package br.com.vxtel.faleMais.valores;

import br.com.vxtel.faleMais.DadosParaCalculo;

/**
 *
 * @author axavi
 */
public class CorrenteRetornoDoValor {

    public double retornarValor(DadosParaCalculo dadosParaCalculo) {
        OrigemDestino v1 = new Origem011Destino016();
        OrigemDestino v2 = new Origem011Destino017();
        OrigemDestino v3 = new Origem011Destino018();
        OrigemDestino v4 = new Origem016Destino011();
        OrigemDestino v5 = new Origem017Destino011();
        OrigemDestino v6 = new Origem018Destino011();
        OrigemDestino v7 = new SemValor();
        
        v1.setProximoValor(v2);
        v2.setProximoValor(v3);
        v3.setProximoValor(v4);
        v4.setProximoValor(v5);
        v5.setProximoValor(v6);
        v6.setProximoValor(v7);
        
        return v1.retornarValor(dadosParaCalculo);
    }
}
