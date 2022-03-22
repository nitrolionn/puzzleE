package com.puzzle.service.exception;

/**
 * Thrown when player was not found.
 */
public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
