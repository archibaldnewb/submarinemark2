package com.qa;

public abstract class MilitaryVehicle {
    public MilitaryVehicle() {
        this("Unknown", 0, 0, OWNER.UNKNOWN);
    }
    public MilitaryVehicle(String name, int age, int killcount, OWNER owner) {
        this.name = name;
        this.age = age;
        this.killcount = killcount;
        this.owner = owner;
    }
    private String name;
    private int age;
    private int killcount;
    private OWNER owner;

    public int getKillcount() {
        return killcount;
    }

    public void setKillcount(int killcount) {
        this.killcount = killcount;
    }

    public OWNER getOwner() {
        return owner;
    }

    public void setOwner(OWNER owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String shootMain() {
        return this.getName() + " has shot their gun!";
    }
}
