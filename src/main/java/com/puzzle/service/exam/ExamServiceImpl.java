package com.puzzle.service.exam;

import com.puzzle.model.entity.Exam;
import com.puzzle.model.entity.Player;
import com.puzzle.model.entity.Puzzle;
import com.puzzle.service.exception.IllegalPuzzleItemsException;
import com.puzzle.service.player.PlayerService;
import com.puzzle.service.puzzle.PuzzleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ExamServiceImpl implements ExamService {

    private final PlayerService playerService;
    private final PuzzleService puzzleService;

    @Override
    public Exam check(int playerId, int puzzleId, Set<Integer> itemsFound) {
        Player player = playerService.getPlayerById(playerId);
        Puzzle puzzle = puzzleService.getPuzzleById(puzzleId);

        if (!puzzle.getPuzzle().containsAll(itemsFound)) {
            throw new IllegalPuzzleItemsException("Puzzle does not contain such items.");
        }

        Set<Integer> missingItems = new HashSet<>(puzzle.getPuzzle());
        missingItems.removeAll(itemsFound);

        return new Exam(puzzleId, player.getName(), missingItems);
    }
}
