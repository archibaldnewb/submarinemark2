package com.qa;

public abstract class Naval extends MilitaryVehicle{
    public Naval() {
        this.numberOfLifeJackets = 0;
    }

    public Naval(String name, int age, int killcount, OWNER owner, int numberOfLifeJackets) {
        super(name, age, killcount, owner);
        this.numberOfLifeJackets = numberOfLifeJackets;
    }
    private int numberOfLifeJackets;

    public int getNumberOfLifeJackets() {
        return numberOfLifeJackets;
    }

    public void setNumberOfLifeJackets(int numberOfLifeJackets) {
        this.numberOfLifeJackets = numberOfLifeJackets;
    }
}
