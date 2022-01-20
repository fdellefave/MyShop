package it.corsospring.web.controller;

import it.corsospring.web.model.Prodotto;
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

        p.setId(123L);
        p.setCategoria("TV");
        p.setNome("Sony 24");
        p.setPrezzo(1500L);

        model.addAttribute("prodotto",p);

        return "demoProdotto";
    }
}
