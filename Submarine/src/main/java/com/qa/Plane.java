package com.qa;

import com.qa.exceptions.InvalidKillcountValueException;

public class Plane extends Air {

    public Plane(String name, int age, int killCount, OWNER owner) throws InvalidKillcountValueException {
        super(name,  age, killCount, owner);
    }
}
