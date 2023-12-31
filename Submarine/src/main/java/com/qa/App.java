package com.qa;

import com.qa.exceptions.InvalidKillcountException;
import com.qa.exceptions.InvalidLifeJacketException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        normalRun();
//        listsAndArrays(SubbyMcSubFace, NorthKorea1, HMSVictoria);
        try {
//            Warship HMSVictoria = new Warship("HMS Victoria", 21, 2147483647, OWNER.United_Kingdom, 1, 1);
//            Submarine BoatyMcBoatFace = new Submarine("BoatyMcBoatFace", 3, -12, OWNER.UNKNOWN, 100);
//            Submarine SubbyMcSubFace = new Submarine("SubbyMcSubFace", 4, 2, OWNER.United_States, 100);
//            Submarine NorthKorea1 = new Submarine();
//            HMSVictoria.setNumberOfLifeJackets(-12);
//            SubbyMcSubFace.setNumberOfLifeJackets(-12);
            Plane myPlane = new Plane("COOL PLANE", 30, 1, OWNER.UNKNOWN);
            methodA(-12, myPlane);

        } catch (InvalidKillcountException e) {
            System.err.println(e);
        } finally {
            System.out.println("This code ran anyway! :)");
        }
    }

//    private static void listsAndArrays(Submarine SubbyMcSubFace, Submarine NorthKorea1, Warship HMSVictoria) {
//        MilitaryVehicle[] navalVessels = new MilitaryVehicle[3];
//        navalVessels[0] = SubbyMcSubFace;
//        navalVessels[1] = NorthKorea1;
//        navalVessels[2] = HMSVictoria;
//
//        for (MilitaryVehicle i : navalVessels) {
//            System.out.println(i.shootMain());
//        }
//
//
//        Plane AirForce1 = new Plane("AirForce1", 1, 3, OWNER.China);
//        IDiveable[] divingVessels = new IDiveable[3];
//        divingVessels[0] = SubbyMcSubFace;
//        divingVessels[1] = NorthKorea1;
//        divingVessels[2] = AirForce1;
//
//        for (IDiveable i : divingVessels) {
//            System.out.println(i.dive());
//        }
//
//        List<IDiveable> divingVesselsList = new ArrayList<>();
//        divingVesselsList.add(SubbyMcSubFace);
//        divingVesselsList.add(NorthKorea1);
//        divingVesselsList.add(AirForce1);
//
//        for (IDiveable i : divingVesselsList) {
//            System.out.println(i.dive());
//        }
//        List<IDiveable> divingVesselsListTest = new ArrayList<IDiveable>() {{
//            add(SubbyMcSubFace);
//            add(NorthKorea1);
//            add(AirForce1);
//        }};
//    }


//    private static void normalRun() {
//        Submarine subbyMcSubface = new Submarine();
//        System.out.println(subbyMcSubface.getAge());
//        subbyMcSubface.setAge(40);
//        System.out.println(subbyMcSubface.getAge());
//        subbyMcSubface.setName("SubbyMcSubFace");
//        System.out.println(subbyMcSubface.getName());
//        subbyMcSubface.setOwner(OWNER.United_Kingdom);
//        System.out.println(subbyMcSubface.getOwner());
//
//        Submarine USSGun = new Submarine("USSGun", 4, 2, OWNER.United_States, 100);
//        Submarine NorthKorea1 = new Submarine("Kimmy", 10, 6000, OWNER.China, 1);
//
//        System.out.println(subbyMcSubface);
//        System.out.println(USSGun);
//        System.out.println(NorthKorea1);
//
//        System.out.println("The current building material is: " + Submarine.getBuildingMaterial());
//        Submarine.setBuildingMaterial("Carbon Fibre");
//        System.out.println("The new building material is: " + Submarine.getBuildingMaterial());
//
////        System.out.println(subbyMcSubface.getWeaponry());
//        subbyMcSubface.printWeaponry(subbyMcSubface.getWeaponry());
//
//        String[] newWeaponry = new String[4];
//        newWeaponry[0] = "Silly string";
//        newWeaponry[1] = "Party poppers";
//        newWeaponry[2] = "Taser";
//        newWeaponry[3] = "Party nuke";
//        subbyMcSubface.setWeaponry(newWeaponry);
//        subbyMcSubface.printWeaponry(subbyMcSubface.getWeaponry());
//
//        ArrayList<Submarine> submarineList = new ArrayList<>();
//        submarineList.add(subbyMcSubface);
//        submarineList.add(USSGun);
//    }

    public static void methodC(int number, Plane plane) throws InvalidKillcountException {
        try {
            System.out.println("methodC Called");
            plane.setKillcount(number);
        } finally {
            System.out.println("FINALLY DONE METHOD C");
        }
    }

    public static void methodB(int input, Plane plane) throws InvalidKillcountException {
        try {
            System.out.println("methodB Called");
            methodC(input, plane);
        } finally {
            System.out.println("FINALLY DONE METHOD B");
        }
    }

    public static void methodA(int input, Plane plane) throws InvalidKillcountException {
        try {
            System.out.println("methodA Called");
            methodB(input, plane);
        } finally {
            System.out.println("FINALLY DONE METHOD A");
        }
    }
}
