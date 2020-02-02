package br.com.vxtel.faleMais;

import br.com.vxtel.faleMais.entities.DDD;
import br.com.vxtel.faleMais.entities.Plano;
import java.util.List;

/**
 *
 * @author axavi
 * 
 * Classe responsável por armazenar os dados que serão urtilizados para o 
 * cálculo do valor da ligação.
 */
public class DadosParaCalculo {
    public List<DDD> dddOrigem;
    public List<DDD> dddDestino;
    public int minutos;
    public List<Plano> planoEscolhido;

    public List<DDD> getDddOrigem() {
        return dddOrigem;
    }

    public void setDddOrigem(List<DDD> dddOrigem) {
        this.dddOrigem = dddOrigem;
    }

    public List<DDD> getDddDestino() {
        return dddDestino;
    }

    public void setDddDestino(List<DDD> dddDestino) {
        this.dddDestino = dddDestino;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public List<Plano> getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(List<Plano> planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }
}
