package br.com.vxtel.faleMais.services;

import br.com.vxtel.faleMais.entities.FaleMaisValores;
import br.com.vxtel.faleMais.repositories.FaleMaisValoresRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author axavi
 *
 * Classe responsável por implementar o serviço com os métodos CRUD.
 */
@Service
public class FaleMaisValoresServiceImpl implements FaleMaisValoresService {

    private FaleMaisValoresRepository faleMaisValoresRepository;

    public FaleMaisValoresServiceImpl(FaleMaisValoresRepository faleMaisValoresRepository) {
        this.faleMaisValoresRepository = faleMaisValoresRepository;
    }

    @Override
    public void salvar(FaleMaisValores faleMaisValores) {
        this.faleMaisValoresRepository.save(faleMaisValores);
    }

    @Override
    public FaleMaisValores buscarPorId(Long id) {
        Optional<FaleMaisValores> optional
                = this.faleMaisValoresRepository.findById(id);

        return optional.get();
    }

    @Override
    public List<FaleMaisValores> listarTodas() {
        List<FaleMaisValores> valores = new ArrayList<>();
        Iterator<FaleMaisValores> iterator
                = this.faleMaisValoresRepository.findAll().iterator();

        while (iterator.hasNext()) {
            valores.add(iterator.next());
        }

        return valores;
    }

    @Override
    public void removerPorId(Long id) {
        this.faleMaisValoresRepository.deleteById(id);
    }

}
