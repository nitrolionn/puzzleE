package com.puzzle.model.mapper.puzzle;

import com.puzzle.controller.dto.PuzzleDto;
import com.puzzle.model.entity.Puzzle;
import com.puzzle.model.mapper.MapperToDto;
import org.springframework.stereotype.Component;

@Component
public class PuzzleMapper implements MapperToDto<Puzzle, PuzzleDto> {
    @Override
    public PuzzleDto toDto(Puzzle entity) {
        return new PuzzleDto(entity.getId(), entity.getPuzzle().size());
    }
}
