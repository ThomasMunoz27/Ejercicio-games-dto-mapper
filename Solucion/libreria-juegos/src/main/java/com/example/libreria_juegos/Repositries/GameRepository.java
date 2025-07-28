package com.example.libreria_juegos.Repositries;

import com.example.libreria_juegos.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
