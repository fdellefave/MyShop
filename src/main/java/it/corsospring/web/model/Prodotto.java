package it.corsospring.web.model;

public class Prodotto {
    private Long id;
    private String nome;
    private String categoria;
    private Long prezzo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Long prezzo) {
        this.prezzo = prezzo;
    }
}
