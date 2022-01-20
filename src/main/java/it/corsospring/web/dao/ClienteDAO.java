package it.corsospring.web.dao;

import it.corsospring.web.dao.model.Cliente;

public interface ClienteDAO {

    public void add(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(int idCliente);

    int count();
}
