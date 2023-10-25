package com.qa;

import com.qa.exceptions.InvalidKillcountException;
import com.qa.exceptions.InvalidLifeJacketException;

public abstract class Naval extends MilitaryVehicle{
    public Naval() throws InvalidKillcountException {
        this.numberOfLifeJackets = 0;
    }

    public Naval(String name, int age, int killcount, OWNER owner, int numberOfLifeJackets) throws InvalidKillcountException {
        super(name, age, killcount, owner);
        this.numberOfLifeJackets = numberOfLifeJackets;
    }
    private int numberOfLifeJackets;

    public int getNumberOfLifeJackets() {
        return numberOfLifeJackets;
    }

    public void setNumberOfLifeJackets(int numberOfLifeJackets) throws InvalidLifeJacketException {
        if (!(numberOfLifeJackets < 0)) {
            this.numberOfLifeJackets = numberOfLifeJackets;
        } else {
            throw new InvalidLifeJacketException(this.getName() + " has an invalid number of life jackets");
        }
    }

    @Override
    public String shootMain() {
        return this.getName() + " has shot their gun!";
    }
}
