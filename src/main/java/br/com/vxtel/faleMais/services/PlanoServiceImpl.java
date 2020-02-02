package br.com.vxtel.faleMais.services;

import br.com.vxtel.faleMais.entities.Plano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import br.com.vxtel.faleMais.repositories.PlanoRepository;

/**
 *
 * @author axavi
 *
 * Classe responsável por implementar o serviço com os métodos CRUD.
 */
@Service
public class PlanoServiceImpl implements PlanoService {

    private PlanoRepository planoRepository;

    public PlanoServiceImpl(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    @Override
    public void salvar(Plano plano) {
        this.planoRepository.save(plano);
    }

    @Override
    public Plano buscarPorId(Long id) {
        Optional<Plano> optional
                = this.planoRepository.findById(id);

        return optional.get();
    }

    @Override
    public List<Plano> listarTodas() {
        List<Plano> planos = new ArrayList<>();
        Iterator<Plano> iterator
                = this.planoRepository.findAll().iterator();

        while (iterator.hasNext()) {
            planos.add(iterator.next());
        }

        return planos;
    }

    @Override
    public void removerPorId(Long id) {
        this.planoRepository.deleteById(id);
    }
}
