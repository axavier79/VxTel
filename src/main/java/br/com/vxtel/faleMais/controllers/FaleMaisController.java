package br.com.vxtel.faleMais.controllers;

import br.com.vxtel.faleMais.DadosParaCalculo;
import br.com.vxtel.faleMais.Resultado;
import br.com.vxtel.faleMais.entities.DDD;
import br.com.vxtel.faleMais.entities.Plano;
import br.com.vxtel.faleMais.services.FaleMaisValoresService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.vxtel.faleMais.services.DDDService;
import br.com.vxtel.faleMais.services.PlanoService;
import br.com.vxtel.faleMais.valores.CorrenteRetornoDoValor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author axavi
 *
 * Classe responsável por controlar a página Home.
 */
@Controller
@RequestMapping("/")
public class FaleMaisController {

    private FaleMaisValoresService faleMaisValoresService;
    private DDDService dddService;
    private PlanoService planoService;
    private DadosParaCalculo dadosParaCalculo;

    public FaleMaisController(
            FaleMaisValoresService faleMaisValoresService,
            DDDService dddService,
            PlanoService planoService) {
        this.faleMaisValoresService = faleMaisValoresService;
        this.dddService = dddService;
        this.planoService = planoService;
    }

    @GetMapping("/home")
    public String iniciar(Model model) {
        dadosParaCalculo = new DadosParaCalculo();
        dadosParaCalculo.setDddOrigem(dddService.listarTodas());
        dadosParaCalculo.setDddDestino(dddService.listarTodas());
        dadosParaCalculo.setPlanoEscolhido(planoService.listarTodas());
//        dadosParaCalculo.setMinutos(0);
        model.addAttribute("dadosParaCalculo", dadosParaCalculo);

        return "/faleMais/home";
    }

    @PostMapping("/calcular")
    public String calcular(
            DadosParaCalculo dadosParaCalculo,
            Model model) {

        CorrenteRetornoDoValor valorPorMinuto = new CorrenteRetornoDoValor();

//        //Não consegui receber os dados dos DDDs de Origem e Destino
//        System.out.println(dadosParaCalculo.getDddOrigem());
//        System.out.println(dadosParaCalculo.getDddDestino());
//        System.out.println(dadosParaCalculo.getMinutos());
//        System.out.println(dadosParaCalculo.getPlanoEscolhido());
        //--INÍCIO - Inserção de dados manual 
        //Para teste, pois não consegui recuperar
        //corretametne os dados enviados por POST
        List<DDD> listaDDDOrigem = new ArrayList<>();
        listaDDDOrigem.add(dddService.buscarPorId(Long.parseLong("3")));
        dadosParaCalculo.setDddOrigem(listaDDDOrigem);
        List<DDD> listaDDDDestino = new ArrayList<>();
        listaDDDDestino.add(dddService.buscarPorId(Long.parseLong("1")));
        dadosParaCalculo.setDddDestino(listaDDDDestino);
        dadosParaCalculo.setMinutos(180);
        List<Plano> listaPlano = new ArrayList<>();
        listaPlano.add(planoService.buscarPorId(Long.parseLong("3")));
        dadosParaCalculo.setPlanoEscolhido(listaPlano);
        //--FIM - Inserção de dados manual

        Resultado resultado = new Resultado(
                dadosParaCalculo.getDddOrigem().get(0).getCodDDD(),
                dadosParaCalculo.getDddDestino().get(0).getCodDDD(),
                dadosParaCalculo.getMinutos(),
                dadosParaCalculo.getPlanoEscolhido().get(0).getNome(),
                valorPorMinuto.retornarValor(dadosParaCalculo));
        resultado.calcularValorComPlano();
        resultado.calcularValorSemPlano();

        model.addAttribute("resultado", resultado);

        return "/faleMais/calcular";
    }

//    @RequestMapping(value = "/teste", method = RequestMethod.POST)
//    public String calcular(
//            @ModelAttribute(value = "dadosParaCalculo") DadosParaCalculo dadosParaCalculo) {
//
//        System.out.println(dadosParaCalculo.getDddOrigem());
//        System.out.println(dadosParaCalculo.getDddDestino());
//        System.out.println(dadosParaCalculo.getMinutos());
//        System.out.println(dadosParaCalculo.getPlanoEscolhido());
//
//        return "/faleMais/teste";
//    }
}
