package com.puzzle.model.repository;

import com.puzzle.model.entity.Puzzle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuzzleRepository extends JpaRepository<Puzzle, Integer> {
}
