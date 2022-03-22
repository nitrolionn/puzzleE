package com.puzzle.controller;

import com.puzzle.controller.dto.PuzzleDto;
import com.puzzle.model.entity.Puzzle;
import com.puzzle.model.mapper.puzzle.PuzzleMapper;
import com.puzzle.service.puzzle.PuzzleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PuzzleController {

    private final PuzzleMapper puzzleMapper;
    private final PuzzleService puzzleService;

    /**
     * Creates a new puzzle.
     *
     * @param puzzleDto {@link PuzzleDto} object.
     * @return Created puzzle.
     */
    @PostMapping(value = "/api/puzzle")
    @ResponseStatus(value = HttpStatus.CREATED)
    public PuzzleDto createPuzzle(@RequestBody PuzzleDto puzzleDto) {
        Puzzle puzzle = puzzleService.newInstance(puzzleDto.getNumberOfItems());
        return puzzleMapper.toDto(puzzle);
    }
}
