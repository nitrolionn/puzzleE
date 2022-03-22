package com.puzzle.service.exception;

/**
 * Thrown when puzzle was not found.
 */
public class PuzzleNotFoundException extends RuntimeException {

    public PuzzleNotFoundException(String message) {
        super(message);
    }
}
