package it.corsospring.web.dao.implement;

import it.corsospring.web.dao.ClienteDAO;
import it.corsospring.web.dao.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ClienteDAOImpl implements ClienteDAO {
    private JdbcTemplate conn;

    public ClienteDAOImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }

    @Override
    public void add(Cliente cliente) {

        String sql = "INSERT INTO cliente(nome,cognome,codice_fiscale,email,username,password) VALUES(?,?,?,?,?,?)";

        conn.update(sql,cliente.getNome(),cliente.getCognome(),
                cliente.getCodiceFiscale(),cliente.getEmail(),
                cliente.getUsername(),cliente.getPassword());
    }
}
