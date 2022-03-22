package com.puzzle.service.exception;

/**
 * Thrown when puzzle does not contain looked for items.
 */
public class IllegalPuzzleItemsException extends RuntimeException {

    public IllegalPuzzleItemsException(String message) {
        super(message);
    }
}
