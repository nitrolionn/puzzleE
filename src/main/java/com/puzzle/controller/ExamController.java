package com.puzzle.controller;

import com.puzzle.controller.dto.ExamRequestDto;
import com.puzzle.controller.dto.ExamResponseDto;
import com.puzzle.model.entity.Exam;
import com.puzzle.model.mapper.exam.ExamMapper;
import com.puzzle.service.exam.ExamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ExamController {
    private final ExamMapper examMapper;
    private final ExamService examService;

    /**
     * Sends puzzle answers to server check, and gets result.
     *
     * @param puzzleId       Puzzle id.
     * @param examRequestDto {@link ExamRequestDto} object.
     * @return The exam result object.
     */
    @PostMapping(value = "/exam/check/{puzzleId}")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ExamResponseDto exam(@PathVariable int puzzleId, @RequestBody ExamRequestDto examRequestDto) {
        Exam exam = examService.check(examRequestDto.getPlayerId(), puzzleId, examRequestDto.getItemsFound());
        return examMapper.toDto(exam);
    }
}
