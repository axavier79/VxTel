package br.com.vxtel.faleMais.repositories;

import br.com.vxtel.faleMais.entities.FaleMaisValores;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author axavi
 * 
 * Interface responsável por criar o CRUD da Classe FaleMaisValores.
 */
public interface FaleMaisValoresRepository extends CrudRepository<FaleMaisValores, Long>{
    
}
