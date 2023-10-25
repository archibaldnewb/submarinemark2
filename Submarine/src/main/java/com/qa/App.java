package com.qa;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        normalRun();
        Submarine SubbyMcSubFace = new Submarine("USSGun", 4, 2, OWNER.United_States, 100);
        Submarine NorthKorea1 = new Submarine();
        Warship HMSVictoria = new Warship("HMS Victoria", 21, 2147483647, OWNER.United_Kingdom, 1, 1);

        Naval[] navalVessels = new Naval[3];
        navalVessels[0] = SubbyMcSubFace;
        navalVessels[1] = NorthKorea1;
        navalVessels[2] = HMSVictoria;

        for (Naval i : navalVessels) {
            System.out.println(i.shootMain());
        }
    }

    private static void normalRun() {
        Submarine subbyMcSubface = new Submarine();
        System.out.println(subbyMcSubface.getAge());
        subbyMcSubface.setAge(40);
        System.out.println(subbyMcSubface.getAge());
        subbyMcSubface.setName("SubbyMcSubFace");
        System.out.println(subbyMcSubface.getName());
        subbyMcSubface.setOwner(OWNER.United_Kingdom);
        System.out.println(subbyMcSubface.getOwner());

        Submarine USSGun = new Submarine("USSGun", 4, 2, OWNER.United_States, 100);
        Submarine NorthKorea1 = new Submarine("Kimmy", 10, 6000, OWNER.China, 1);

        System.out.println(subbyMcSubface);
        System.out.println(USSGun);
        System.out.println(NorthKorea1);

        System.out.println("The current building material is: " + Submarine.getBuildingMaterial());
        Submarine.setBuildingMaterial("Carbon Fibre");
        System.out.println("The new building material is: " + Submarine.getBuildingMaterial());

//        System.out.println(subbyMcSubface.getWeaponry());
        subbyMcSubface.printWeaponry(subbyMcSubface.getWeaponry());

        String[] newWeaponry = new String[4];
        newWeaponry[0] = "Silly string";
        newWeaponry[1] = "Party poppers";
        newWeaponry[2] = "Taser";
        newWeaponry[3] = "Party nuke";
        subbyMcSubface.setWeaponry(newWeaponry);
        subbyMcSubface.printWeaponry(subbyMcSubface.getWeaponry());

        ArrayList<Submarine> submarineList = new ArrayList<>();
        submarineList.add(subbyMcSubface);
        submarineList.add(USSGun);
    }
}
