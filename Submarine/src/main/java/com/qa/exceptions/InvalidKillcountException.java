package com.qa.exceptions;

public class InvalidKillcountException extends Exception {
    public InvalidKillcountException() {
        this("Invalid killcount value");
    }
    public InvalidKillcountException(String customMessage) {
        super(customMessage);
    }
}
