package br.com.vxtel.faleMais.seed;

import br.com.vxtel.faleMais.entities.DDD;
import br.com.vxtel.faleMais.entities.FaleMaisValores;
import br.com.vxtel.faleMais.entities.Plano;
import br.com.vxtel.faleMais.repositories.FaleMaisValoresRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import br.com.vxtel.faleMais.repositories.DDDRepository;
import br.com.vxtel.faleMais.repositories.PlanoRepository;

/*Será executado uma vez quando a aplicação for inicializada*/
@Component
public class SeedDev implements ApplicationListener<ContextRefreshedEvent> {

    private DDDRepository dddRepository;
    private FaleMaisValoresRepository faleMaisValoresRepository;
    private PlanoRepository planoRepository;

    public SeedDev(
            DDDRepository dddRepository,
            FaleMaisValoresRepository faleMaisValoresRepository,
            PlanoRepository planoRepository) {
        this.dddRepository = dddRepository;
        this.faleMaisValoresRepository = faleMaisValoresRepository;
        this.planoRepository = planoRepository;
    }

    public void onApplicationEvent(ContextRefreshedEvent e) {
        inserirDados();
    }

    public void inserirDados() {
        DDD ddd011 = new DDD();
        DDD ddd016 = new DDD();
        DDD ddd017 = new DDD();
        DDD ddd018 = new DDD();

        ddd011.setCodDDD("011");
        ddd016.setCodDDD("016");
        ddd017.setCodDDD("017");
        ddd018.setCodDDD("018");

        if (dddRepository.count() == 0) {
            dddRepository.save(ddd011);
            dddRepository.save(ddd016);
            dddRepository.save(ddd017);
            dddRepository.save(ddd018);
        }
        
        Plano plano1 = new Plano();
        Plano plano2 = new Plano();
        Plano plano3 = new Plano();

        plano1.setNome("Fale Mais 30");
        plano2.setNome("Fale Mais 60");
        plano3.setNome("Fale Mais 120");
        
        if (planoRepository.count() == 0){
            planoRepository.save(plano1);
            planoRepository.save(plano2);
            planoRepository.save(plano3);
        }
        
//        FaleMaisValores item1 = new FaleMaisValores();
//        FaleMaisValores item2 = new FaleMaisValores();
//        FaleMaisValores item3 = new FaleMaisValores();
//        FaleMaisValores item4 = new FaleMaisValores();
//        FaleMaisValores item5 = new FaleMaisValores();
//        FaleMaisValores item6 = new FaleMaisValores();
//
//        item1.setDddOrigem(ddd011);
////        item1.setDddDestino(ddd016);
//        item1.setValorPorMinuto(1.90);
//        item2.setDddOrigem(ddd016);
////        item2.setDddDestino(ddd011);
//        item2.setValorPorMinuto(2.90);
//        item3.setDddOrigem(ddd011);
////        item3.setDddDestino(ddd017);
//        item3.setValorPorMinuto(1.70);
//        item4.setDddOrigem(ddd017);
////        item4.setDddDestino(ddd011);
//        item4.setValorPorMinuto(2.70);
//        item5.setDddOrigem(ddd011);
////        item5.setDddDestino(ddd018);
//        item5.setValorPorMinuto(0.90);
//        item6.setDddOrigem(ddd018);
////        item6.setDddDestino(ddd011);
//        item6.setValorPorMinuto(1.90);
//
//        if (faleMaisValoresRepository.count() == 0) {
//            faleMaisValoresRepository.save(item1);
//            faleMaisValoresRepository.save(item2);
//            faleMaisValoresRepository.save(item3);
//            faleMaisValoresRepository.save(item4);
//            faleMaisValoresRepository.save(item5);
//            faleMaisValoresRepository.save(item6);
//        }
    }
}
