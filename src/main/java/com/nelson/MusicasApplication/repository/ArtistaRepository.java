package com.nelson.MusicasApplication.repository;

import com.nelson.MusicasApplication.modelo.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
