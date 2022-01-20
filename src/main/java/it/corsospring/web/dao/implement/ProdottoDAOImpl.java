package it.corsospring.web.dao.implement;

import it.corsospring.web.dao.CategoriaDAO;
import it.corsospring.web.dao.ProdottoDAO;
import it.corsospring.web.dao.model.Prodotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ProdottoDAOImpl implements ProdottoDAO {
    private JdbcTemplate conn;

    public ProdottoDAOImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }

    @Override
    public void Prodotto(Prodotto prodotto) {

        String sql = "INSERT INTO prodotto(nome,id_categoria,descrizione,prezzo_unitario,unita_di_misura) VALUES(?,?,?,?,?)";

        conn.update(sql,prodotto.getIdProdotto(), prodotto.getCategoria(),
                prodotto.getDescrizione(), prodotto.getPrezzoUnitario(), prodotto.getUnitaDiMisura());
    }
}
