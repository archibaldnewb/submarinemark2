package com.qa;

import com.qa.exceptions.InvalidKillcountValue;

public class Warship extends Naval {
    public Warship() throws InvalidKillcountValue {
        this.numberOfLifeboats = 0;
    }
    public Warship(String name, int age, int killcount, OWNER owner, int numberOfLifeJackets, int numberOfLifeboats) throws InvalidKillcountValue {
        super(name, age, killcount, owner, numberOfLifeJackets);
        this.numberOfLifeboats = numberOfLifeboats;
    }

    private int numberOfLifeboats;

    public int getNumberOfLifeboats() {
        return numberOfLifeboats;
    }

    public void setNumberOfLifeboats(int numberOfLifeboats) {
        this.numberOfLifeboats = numberOfLifeboats;
    }
}
