package com.puzzle.service.exam;

import com.puzzle.model.entity.Exam;

import java.util.Set;

public interface ExamService {
    Exam check(int playerId, int puzzleId, Set<Integer> itemsFound);
}
