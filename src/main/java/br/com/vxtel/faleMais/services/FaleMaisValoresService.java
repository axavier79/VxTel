package br.com.vxtel.faleMais.services;

import br.com.vxtel.faleMais.entities.FaleMaisValores;
import java.util.List;

/**
 *
 * @author axavi
 * 
 * Interface responsável por criar o serviço com os métodos CRUD.
 */
public interface FaleMaisValoresService {
    public void salvar(FaleMaisValores faleMaisValores);
    public FaleMaisValores buscarPorId(Long id);
    public List<FaleMaisValores> listarTodas();
    public void removerPorId(Long id);
}
