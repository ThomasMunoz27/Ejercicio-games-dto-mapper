package com.example.libreria_juegos.DTO;

import lombok.Data;

@Data
public class CreateGameDTO {
    private String title;
    private String gender;
    private String description;
    private int releaseYear;
    private double price;
    private String developer;

}
