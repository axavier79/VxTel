package br.com.vxtel.faleMais.repositories;

import br.com.vxtel.faleMais.entities.Plano;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author axavi
 * 
 * Interface responsável por criar o CRUD da Classe DDDs.
 */
public interface PlanoRepository extends CrudRepository<Plano, Long>{
    
}
