package com.example.libreria_juegos.Controller;

import com.example.libreria_juegos.DTO.CreateGameDTO;
import com.example.libreria_juegos.DTO.GameResponseDTO;
import com.example.libreria_juegos.Services.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameResponseDTO> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public GameResponseDTO getGameById(@PathVariable Long id){
        return gameService.getGameById(id);
    }

    @PostMapping
    public ResponseEntity<GameResponseDTO> create(@RequestBody CreateGameDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(gameService.createGame(dto));
    }

}
