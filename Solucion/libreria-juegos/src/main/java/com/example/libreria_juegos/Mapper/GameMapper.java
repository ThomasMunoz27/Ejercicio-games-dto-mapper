package com.example.libreria_juegos.Mapper;

import com.example.libreria_juegos.DTO.CreateGameDTO;
import com.example.libreria_juegos.DTO.GameResponseDTO;
import com.example.libreria_juegos.Entities.Game;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {
    public Game toEntity(CreateGameDTO dto){
        Game game =new Game();

        game.setTitle(dto.getTitle());
        game.setGender(dto.getGender());
        game.setDescription(dto.getDescription());
        game.setReleaseYear(dto.getReleaseYear());
        game.setPrice(dto.getPrice());
        game.setDeveloper(dto.getDeveloper());
        return game;
    }

    public GameResponseDTO toResponseDTO(Game game){
        GameResponseDTO dto = new GameResponseDTO();
        dto.setTitle(game.getTitle());
        dto.setGender(game.getGender());
        dto.setPrice(game.getPrice());
        return dto;
    }
}
