package br.com.vxtel.faleMais.valores;

import br.com.vxtel.faleMais.DadosParaCalculo;

/**
 *
 * @author axavi
 * 
 * Interface responsável por criar o modelo para retornar o valor da ligação de 
 * acordo com o DDD de Origem e o DDD de Destino.
 */
public interface OrigemDestino {
    double retornarValor(DadosParaCalculo dadosParaCalculo);
    void setProximoValor(OrigemDestino proximoValor);
}
