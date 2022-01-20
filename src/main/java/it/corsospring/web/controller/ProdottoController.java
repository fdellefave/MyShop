package it.corsospring.web.controller;


import it.corsospring.web.dao.ProdottoDAO;
import it.corsospring.web.dao.model.Categoria;
import it.corsospring.web.dao.model.Prodotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prodotto")
public class ProdottoController {

    @Autowired
    private ProdottoDAO prodottoService;


    @GetMapping("/count")
    public void count(){
        System.out.println(prodottoService.count());
    }

    @GetMapping("/count/{id}")
    public void countByIdCategoria(@PathVariable String id){
        System.out.println(prodottoService.countcountByIdCategoria(id));
    }

    @GetMapping("/add")
    public String add(){

        Categoria c = new Categoria();
        c.setIdCategoria(1);

        prodottoService.add(new Prodotto(0,"Telecomando",
                "Telecomando per TV Sony",c,
                17,"Euro"));

        return "welcome";
    }

    @GetMapping("/update")
    public void update() {
        Categoria c = new Categoria();
        c.setIdCategoria(1);
        prodottoService.update(new Prodotto(2,"Telecomando",
                "Telecomando per LG",c,
                250,"Lire"));
    }

    @GetMapping("/delete")
    public void delete() {
        prodottoService.delete(3);
    }
}
