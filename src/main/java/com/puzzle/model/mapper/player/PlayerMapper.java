package com.puzzle.model.mapper.player;

import com.puzzle.controller.dto.PlayerDto;
import com.puzzle.model.entity.Player;
import com.puzzle.model.mapper.MapperToDto;
import com.puzzle.model.mapper.MapperToEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper implements MapperToDto<Player, PlayerDto>, MapperToEntity<PlayerDto, Player> {
    @Override
    public PlayerDto toDto(Player entity) {
        return new PlayerDto(entity.getId(), entity.getName(), entity.getBirthDate());
    }

    @Override
    public Player toEntity(PlayerDto dto) {
        Player player = new Player();
        player.setName(dto.getName());
        player.setBirthDate(dto.getBirthDate());
        return player;
    }
}
