package br.com.vxtel.faleMais.services;

import br.com.vxtel.faleMais.entities.Plano;
import java.util.List;

/**
 *
 * @author axavi
 * 
 * Interface responsável por criar o serviço com os métodos CRUD.
 */
public interface PlanoService {
    public void salvar(Plano plano);
    public Plano buscarPorId(Long id);
    public List<Plano> listarTodas();
    public void removerPorId(Long id);
}
