package it.corsospring.web.dao;

import it.corsospring.web.dao.model.Prodotto;

public interface ProdottoDAO {

    void add(Prodotto prodotto);

    void update(Prodotto prodotto);

    void delete(int idProdotto);

    int count();

    int countcountByIdCategoria(String idCategoria);
}
