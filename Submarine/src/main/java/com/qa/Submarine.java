package com.qa;

public class Submarine extends Naval {
    public Submarine() {
        this("Unknown", 0, 0, OWNER.UNKNOWN, 0);
    }

    public Submarine(String name, int age, int killcount, OWNER owner, int numberOfLifeJackets) {
        super(name, age, killcount, owner, numberOfLifeJackets);
    }

    private double depth = 0.01;
    private String[] weaponry = {"Machine Fun", "Canon", "Nuke"};

    public String[] getWeaponry() {
        return weaponry;
    }

    public void setWeaponry(String[] weaponry) {
        this.weaponry = weaponry;
    }

    public void printWeaponry(String[] weaponry) {
        for (String item : weaponry) {
            System.out.println(item);
        }
    }

    private static String buildingMaterial = "Stainless Steel";

    public static String getBuildingMaterial() {
        return buildingMaterial;
    }

    public static void setBuildingMaterial(String buildingMaterial) {
        Submarine.buildingMaterial = buildingMaterial;
    }

    @Override
    public String shootMain() {
        return this.getName() + " has shot their torpedo!";
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Kill-count: %d, Owner: %s", this.getName(), this.getAge(), this.getKillcount(), this.getOwner().toString());
    }
}
