package it.corsospring.web.controller;

import it.corsospring.web.dao.CategoriaDAO;
import it.corsospring.web.dao.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaDAO categoriaService;


    @GetMapping("/count")
    public void count(){
        System.out.println(categoriaService.count());
    }


    @GetMapping("/add")
    public void add() {
        categoriaService.add(new Categoria(0, "TV",
                "Sony 24 Pollici", null));
    }

    @GetMapping("/update")
    public void update() {
        categoriaService.update(new Categoria(2, "SoundBar",
                "400DB", null));
    }

    @GetMapping("/delete")
    public void delete() {
        categoriaService.delete(1);
    }

    @GetMapping("/get")
    public String get(){
        Categoria c = categoriaService.getCategoria(2);

        System.out.println(c.getNome());

        return "welcome";
    }

    @GetMapping("/getCategorie")
    public String getCategorie(){
        List<Categoria> c = categoriaService.getListaCategorie();

        System.out.println(c.size());

        return "welcome";
    }

}
