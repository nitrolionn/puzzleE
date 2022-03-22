package com.puzzle.model.mapper.exam;

import com.puzzle.controller.dto.ExamResponseDto;
import com.puzzle.model.entity.Exam;
import com.puzzle.model.mapper.MapperToDto;
import org.springframework.stereotype.Component;

@Component
public class ExamMapper implements MapperToDto<Exam, ExamResponseDto> {
    @Override
    public ExamResponseDto toDto(Exam entity) {
        return new ExamResponseDto(entity.getPuzzleId(), entity.getName(), entity.getMissingItems());
    }
}
