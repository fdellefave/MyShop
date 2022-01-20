package it.corsospring.web.controller;

import it.corsospring.web.dao.model.Categoria;
import it.corsospring.web.dao.model.Prodotto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping("/")
    public String welcome(ModelMap model){
        model.addAttribute("message","Ciao, benvenuto nel mio e-commerce");
        return "welcome";
    }

    @GetMapping("mypage")
    public String mypage(ModelMap model){
        model.addAttribute("user","Federico");
        model.addAttribute("message"," un bel ragazzo");
        return "mypage";
    }

    @GetMapping("/demoProdotto")
    public String demoProdotto(ModelMap model){

        Prodotto p = new Prodotto();
        Categoria c = new Categoria();

        p.setIdProdotto(10);
        p.setCategoria(c);
        p.setNome("Sony 24");
        p.setPrezzoUnitario(350);

        model.addAttribute("prodotto",p);

        return "demoProdotto";
    }
}
