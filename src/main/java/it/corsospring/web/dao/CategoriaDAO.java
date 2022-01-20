package it.corsospring.web.dao;

import it.corsospring.web.dao.model.Categoria;

import java.util.List;

public interface CategoriaDAO {

    void add(Categoria categoria);

    void update(Categoria categoria);

    void delete(int idCategoria);

    int count(); //Conta quante categorie sono presenti nel database

    Categoria getCategoria(int id);

    List<Categoria> getListaCategorie();
}
