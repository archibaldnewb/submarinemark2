package com.qa.exceptions;

public class InvalidKillcountValueException extends Exception {
    public InvalidKillcountValueException() {
        this("Invalid killcount value");
    }
    public InvalidKillcountValueException(String customMessage) {
        super(customMessage);
    }
}
