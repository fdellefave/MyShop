package it.corsospring.web.controller;

import it.corsospring.web.dao.CategoriaDAO;
import it.corsospring.web.dao.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaDAO categoriaService;


    @GetMapping("/add")
    public void add() {
        categoriaService.add(new Categoria(0,"TV","Sony 24 Pollici",null));
    }

    @GetMapping("/update")
    public void update(){
        categoriaService.update(new Categoria(2,"SoundBar","400DB",null));
    }
}
