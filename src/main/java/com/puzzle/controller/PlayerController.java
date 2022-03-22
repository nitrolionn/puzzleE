package com.puzzle.controller;

import com.puzzle.controller.dto.PlayerDto;
import com.puzzle.model.entity.Player;
import com.puzzle.model.mapper.player.PlayerMapper;
import com.puzzle.service.player.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayerController {

    private final PlayerMapper playerMapper;
    private final PlayerService playerService;

    /**
     * Creates a player with the provided content.
     *
     * @param playerDto {@link PlayerDto} object.
     * @return Created player.
     */
    @PostMapping(value = "/api/player")
    @ResponseStatus(value = HttpStatus.CREATED)
    public PlayerDto createPlayer(@RequestBody PlayerDto playerDto) {
        Player player = playerMapper.toEntity(playerDto);
        player = playerService.save(player);

        return playerMapper.toDto(player);
    }
}
