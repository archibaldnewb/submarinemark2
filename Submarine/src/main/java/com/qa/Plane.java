package com.qa;

import com.qa.exceptions.InvalidKillcountException;

public class Plane extends Air {

    public Plane(String name, int age, int killCount, OWNER owner) throws InvalidKillcountException {
        super(name,  age, killCount, owner);
    }
}
