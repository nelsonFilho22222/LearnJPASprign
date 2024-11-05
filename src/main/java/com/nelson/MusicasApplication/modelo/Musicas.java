package com.nelson.MusicasApplication.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    private Artista artista;

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", artista=" + artista;
    }
}
