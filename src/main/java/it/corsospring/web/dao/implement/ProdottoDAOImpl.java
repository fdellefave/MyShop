package it.corsospring.web.dao.implement;

import it.corsospring.web.dao.ProdottoDAO;
import it.corsospring.web.dao.model.Prodotto;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ProdottoDAOImpl implements ProdottoDAO {

    private JdbcTemplate conn;
    public ProdottoDAOImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }



    @Override
    public void add(Prodotto prodotto) {
        String sql = "INSERT INTO prodotto(nome,id_categoria,descrizione,prezzo_unitario,unita_di_misura) VALUES(?,?,?,?,?)";
        conn.update(sql, prodotto.getNome(), prodotto.getCategoria().getIdCategoria(), prodotto.getDescrizione(), prodotto.getPrezzoUnitario(), prodotto.getUnitaDiMisura());
    }

    public void update(Prodotto p) {
        String sql = "UPDATE prodotto SET nome=?, id_categoria=?, descrizione=?, prezzo_unitario=?, unita_di_misura=? WHERE id_prodotto=?";
        conn.update(sql, p.getNome(), p.getCategoria().getIdCategoria(), p.getDescrizione(), p.getPrezzoUnitario(), p.getUnitaDiMisura(), p.getIdProdotto());
    }

    public void delete(int idProdotto){
        String sql = "DELETE FROM prodotto WHERE id_prodotto=?";
        conn.update(sql,idProdotto);
    }

    @Override
    public int count() {
        String sql = "SELECT count(id_prodotto) FROM prodotto";
        return conn.queryForObject(sql,Integer.class);
    }

    @Override
    public int countcountByIdCategoria(String idCategoria) {
        String sql = "SELECT count(id_prodotto) FROM prodotto WHERE id_categoria=?";
        return conn.queryForObject(sql,Integer.class,idCategoria);
    }


}

