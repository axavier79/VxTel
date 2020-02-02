package br.com.vxtel.faleMais.services;

import br.com.vxtel.faleMais.entities.DDD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import br.com.vxtel.faleMais.repositories.DDDRepository;

/**
 *
 * @author axavi
 *
 * Classe responsável por implementar o serviço com os métodos CRUD.
 */
@Service
public class DDDServiceImpl implements DDDService {

    private DDDRepository dddRepository;

    public DDDServiceImpl(DDDRepository dddsRepository) {
        this.dddRepository = dddsRepository;
    }

    @Override
    public void salvar(DDD ddds) {
        this.dddRepository.save(ddds);
    }

    @Override
    public DDD buscarPorId(Long id) {
        Optional<DDD> optional
                = this.dddRepository.findById(id);

        return optional.get();
    }

    @Override
    public List<DDD> listarTodas() {
        List<DDD> valores = new ArrayList<>();
        Iterator<DDD> iterator
                = this.dddRepository.findAll().iterator();

        while (iterator.hasNext()) {
            valores.add(iterator.next());
        }

        return valores;
    }

    @Override
    public void removerPorId(Long id) {
        this.dddRepository.deleteById(id);
    }
}
