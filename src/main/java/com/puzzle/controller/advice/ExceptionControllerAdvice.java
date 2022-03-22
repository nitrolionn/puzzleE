package com.puzzle.controller.advice;

import com.puzzle.service.exception.IllegalPuzzleItemsException;
import com.puzzle.service.exception.PlayerNotFoundException;
import com.puzzle.service.exception.PuzzleNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Helper class to specify an {@link ExceptionHandler} for controllers.
 */
@RestControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {
    /**
     * Handles not found exception.
     *
     * @param exception Not found exception for handling.
     * @return Request error result.
     */
    @ExceptionHandler({PlayerNotFoundException.class, PuzzleNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(Exception exception) {
        logger.error("handleNotFoundException", exception);
        return new ResponseEntity<>(exception.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    /**
     * Handles bad request exception.
     *
     * @param exception Bad request exception for handling.
     * @return Request error result.
     */
    @ExceptionHandler(IllegalPuzzleItemsException.class)
    public ResponseEntity<Object> handleBadRequestException(Exception exception) {
        logger.error("handleBadRequestException", exception);
        return new ResponseEntity<>(exception.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handles exception.
     *
     * @param exception Exception for handling.
     * @return Request error result.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAnyException(Exception exception) {
        logger.error("handleAnyException", exception);
        return new ResponseEntity<>(exception.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
