package it.corsospring.web.dao.model;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cognome;
    private String CodiceFiscale;
    private String email;
    private String telefono;
    private String username;
    private String password;

    public Cliente(int idCliente, String nome, String cognome, String codiceFiscale, String email, String telefono, String username, String password) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.CodiceFiscale = codiceFiscale;
        this.email = email;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        CodiceFiscale = codiceFiscale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
