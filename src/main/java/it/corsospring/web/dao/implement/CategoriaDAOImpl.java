package it.corsospring.web.dao.implement;


import it.corsospring.web.dao.CategoriaDAO;
import it.corsospring.web.dao.model.Categoria;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class CategoriaDAOImpl implements CategoriaDAO {
    private JdbcTemplate conn;

    public CategoriaDAOImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }

    @Override
    public void add(Categoria categoria) {

        String sql = "INSERT INTO categoria(nome,descrizione,id_categoria_padre) VALUES(?,?,?)";

        int categoriaPadre = 0;
        if (categoria.getCategoriaPadre() != null) {
            categoriaPadre = categoria.getCategoriaPadre().getIdCategoria();
        }
        conn.update(sql, categoria.getNome(), categoria.getDescrizione(), categoriaPadre);
    }


    public void update(Categoria categoria) {
        String sql = "UPDATE categoria SET nome=?, descrizione=?, id_categoria_padre=? WHERE id_categoria=?";

        int categoriaPadre = 0;
        if (categoria.getCategoriaPadre() != null) {
            categoriaPadre = categoria.getCategoriaPadre().getIdCategoria();
        }
        conn.update(sql, categoria.getNome(), categoria.getDescrizione(), categoriaPadre, categoria.getIdCategoria());

    }
}
