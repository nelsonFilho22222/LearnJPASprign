package com.nelson.MusicasApplication.modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoArtista tipo;

    @OneToMany(mappedBy = "artista")
    private List<Musicas> musicasList = new ArrayList<>();

    public Artista() {}
    public Artista(String nome, TipoArtista tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

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

    public TipoArtista getTipo() {
        return tipo;
    }

    public void setTipo(TipoArtista tipo) {
        this.tipo = tipo;
    }

    public List<Musicas> getMusicasList() {
        return musicasList;
    }

    public void setMusicasList(List<Musicas> musicasList) {
        this.musicasList = musicasList;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", musicasList=" + musicasList;
    }
}
