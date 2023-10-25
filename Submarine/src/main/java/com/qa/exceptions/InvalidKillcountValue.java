package com.qa.exceptions;

public class InvalidKillcountValue extends Exception {
    public InvalidKillcountValue() {
        this("Invalid killcount value");
    }
    public InvalidKillcountValue(String customMessage) {
        super(customMessage);
    }
}
