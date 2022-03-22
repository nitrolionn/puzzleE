package com.puzzle.service.puzzle;

import com.puzzle.model.entity.Puzzle;

public interface PuzzleService {
    /**
     * Generates and and stores puzzle.
     *
     * @param numOfItems Number of puzzle items.
     * @return Stored puzzle.
     */
    Puzzle newInstance(int numOfItems);


    /**
     * Returns player by id.
     *
     * @param id Player id.
     * @return Player.
     */
    Puzzle getPuzzleById(int id);
}
