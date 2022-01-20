package it.corsospring.web.dao.implement;

import it.corsospring.web.dao.ClienteDAO;
import it.corsospring.web.dao.model.Cliente;
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

        conn.update(sql, cliente.getNome(), cliente.getCognome(), cliente.getCodiceFiscale(), cliente.getEmail(), cliente.getUsername(), cliente.getPassword());
    }

    public void update(Cliente c) {
        String sql = "UPDATE cliente SET nome=?, cognome=?, codice_fiscale=?, email=?, username=?, password=? WHERE id_cliente=?";

        conn.update(sql, c.getNome(), c.getCognome(), c.getCodiceFiscale(), c.getEmail(), c.getUsername(), c.getPassword(), c.getIdCliente());

    }
}
