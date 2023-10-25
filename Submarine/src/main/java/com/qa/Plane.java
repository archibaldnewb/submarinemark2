package com.qa;

import com.qa.exceptions.InvalidKillcountValue;

public class Plane extends Air {

    public Plane(String name, int age, int killCount, OWNER owner) throws InvalidKillcountValue {
        super(name,  age, killCount, owner);
    }
}
