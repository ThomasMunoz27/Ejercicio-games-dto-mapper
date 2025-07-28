package com.example.libreria_juegos.Services;

import com.example.libreria_juegos.DTO.CreateGameDTO;
import com.example.libreria_juegos.DTO.GameResponseDTO;
import com.example.libreria_juegos.Entities.Game;
import com.example.libreria_juegos.Mapper.GameMapper;
import com.example.libreria_juegos.Repositries.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    public GameService(GameRepository gameRepository, GameMapper gameMapper){
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }

    public List<GameResponseDTO> getAllGames(){
        return gameRepository.findAll()
                .stream()
                .map(gameMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public GameResponseDTO getGameById(Long id){
        Game game = gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Juego no encontrado con ID: " + id));
        return gameMapper.toResponseDTO(game);
    }

    public GameResponseDTO createGame(CreateGameDTO dto){
        Game newGame = gameMapper.toEntity(dto);
        newGame = gameRepository.save(newGame);
        return gameMapper.toResponseDTO(newGame);
    }


}
