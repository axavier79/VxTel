package br.com.vxtel.faleMais.services;

import br.com.vxtel.faleMais.entities.DDD;
import java.util.List;

/**
 *
 * @author axavi
 * 
 * Interface responsável por criar o serviço com os métodos CRUD.
 */
public interface DDDService {
    public void salvar(DDD ddd);
    public DDD buscarPorId(Long id);
    public List<DDD> listarTodas();
    public void removerPorId(Long id);
}
