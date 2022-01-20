package it.corsospring.web.dao.implement;


import it.corsospring.web.dao.CategoriaDAO;
import it.corsospring.web.dao.model.Categoria;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

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

    @Override
    public void delete(int idCategoria) {
        String sql = "DELETE FROM categoria WHERE id_categoria=?";
        conn.update(sql, idCategoria);
    }

    @Override
    public int count() {
        String sql = "SELECT count(id_categoria) FROM categoria";
        return conn.queryForObject(sql, Integer.class);
    }

    @Override
    public Categoria getCategoria(int id) {
        String sql = "SELECT id_categoria, nome, descrizione, id_categoria_padre FROM categoria WHERE id_categoria=?";
        return conn.queryForObject(sql, categoriaMapper, id);
    }

    @Override
    public List<Categoria> getListaCategorie() {
        String sql = "SELECT id_categoria, nome, descrizione, id_categoria_padre FROM categoria";
        return conn.query(sql,categoriaMapper);
    }

    /**
     * RowMapper = Un datafactory che può essere riutilizzato in tanti metodi. Dato in ingresso il resultSet,
     * ci ritorna un oggetto del tipo che indichiamo, in questo caso Categoria.
     */
    private final RowMapper<Categoria> categoriaMapper = (resultSet, rowNum) -> {
                Categoria c = new Categoria();

                c.setIdCategoria(resultSet.getInt("id_categoria"));
                c.setNome(resultSet.getString("nome"));
                c.setDescrizione(resultSet.getString("descrizione"));

                int catPadre = resultSet.getInt("id_categoria_padre");
                if (catPadre > 0) {
                    Categoria cp = new Categoria();
                    cp.setIdCategoria(catPadre);
                }

                return c;
            };
}