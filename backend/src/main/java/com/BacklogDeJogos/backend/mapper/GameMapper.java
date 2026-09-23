package com.BacklogDeJogos.backend.mapper;

import com.BacklogDeJogos.backend.dto.BacklogDTO;
import com.BacklogDeJogos.backend.model.Game;

public class GameMapper {

    private GameMapper() {}

    public static BacklogDTO toDTO(Game game){
        return new BacklogDTO(
        game.getId(),
        game.getDescription(),
        game.getValue(),
        game.getQuantity(),
        game.getName()
    );

    }

}