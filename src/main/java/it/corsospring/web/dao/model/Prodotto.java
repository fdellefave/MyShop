package it.corsospring.web.dao.model;

public class Prodotto {
    private int idProdotto;
    private String nome;
    private String descrizione;
    private Categoria categoria;
    private int prezzoUnitario;
    private String UnitaDiMisura;

    public Prodotto(int idProdotto, String nome, String descrizione, Categoria categoria, int prezzoUnitario, String unitaDiMisura) {
        this.idProdotto = idProdotto;
        this.nome = nome;
        this.descrizione = descrizione;
        this.categoria = categoria;
        this.prezzoUnitario = prezzoUnitario;
        this.UnitaDiMisura = unitaDiMisura;
    }

    public Prodotto() {
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(int prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getUnitaDiMisura() {
        return UnitaDiMisura;
    }

    public void setUnitaDiMisura(String unitaDiMisura) {
        UnitaDiMisura = unitaDiMisura;
    }
}

