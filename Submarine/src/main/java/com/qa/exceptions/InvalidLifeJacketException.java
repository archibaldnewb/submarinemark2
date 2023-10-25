package com.qa.exceptions;

public class InvalidLifeJacketException extends Exception{
    public InvalidLifeJacketException() {
        this("EXCEPTION: Invalid number of life jackets");
    }

    public InvalidLifeJacketException(String customMessage) {
        super(customMessage);
    }
}
