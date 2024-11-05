package com.nelson.MusicasApplication.repository;

import com.nelson.MusicasApplication.modelo.Artista;
import com.nelson.MusicasApplication.modelo.Musicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    Optional<Artista> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT m FROM Artista a JOIN a.musicasList m WHERE a.nome ILIKE %:nome%")
    List<Musicas> buscaMusicasPorArtista(String nome);
}
