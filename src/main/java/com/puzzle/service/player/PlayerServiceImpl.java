package com.puzzle.service.player;

import com.puzzle.model.entity.Player;
import com.puzzle.model.repository.PlayerRepository;
import com.puzzle.service.exception.PlayerNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(int id) {
        return playerRepository.findById(id)
            .orElseThrow(() -> new PlayerNotFoundException("Player was not found"));
    }
}
