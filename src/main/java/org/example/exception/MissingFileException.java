package org.example.exception;

public class MissingFileException extends Exception {
    public MissingFileException(String message) {
        super(message);
    }
}
