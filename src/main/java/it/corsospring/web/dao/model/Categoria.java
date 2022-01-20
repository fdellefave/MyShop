package it.corsospring.web.dao.model;

public class Categoria {
    private int idCategoria;
    private String nome;
    private String descrizione;
    private Categoria categoriaPadre;

    public Categoria(int idCategoria, String nome, String descrizione, Categoria categoriaPadre) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descrizione = descrizione;
        this.categoriaPadre = categoriaPadre;
    }

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }
}
