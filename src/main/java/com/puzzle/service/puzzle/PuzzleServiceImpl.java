package com.puzzle.service.puzzle;

import com.puzzle.model.entity.Puzzle;
import com.puzzle.model.repository.PuzzleRepository;
import com.puzzle.service.exception.PuzzleNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class PuzzleServiceImpl implements PuzzleService {

    private final PuzzleGenerator puzzleGenerator;
    private final PuzzleRepository puzzleRepository;

    @Override
    public Puzzle newInstance(int numOfItems) {
        Set<Integer> puzzleItems = puzzleGenerator.generate(numOfItems);
        Puzzle puzzle = new Puzzle(puzzleItems);

        return puzzleRepository.save(puzzle);
    }

    @Override
    public Puzzle getPuzzleById(int id) {
        return puzzleRepository.findById(id)
            .orElseThrow(() -> new PuzzleNotFoundException("Puzzle was not found"));
    }
}
