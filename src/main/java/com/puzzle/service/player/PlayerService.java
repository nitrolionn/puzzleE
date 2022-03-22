package com.puzzle.service.player;

import com.puzzle.model.entity.Player;

public interface PlayerService {
    /**
     * Saves player.
     *
     * @param player Player to save.
     * @return Saved player.
     */
    Player save(Player player);


    /**
     * Returns player by id.
     *
     * @param id Player id.
     * @return Player.
     */
    Player getPlayerById(int id);
}
