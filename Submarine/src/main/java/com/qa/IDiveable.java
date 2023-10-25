package com.qa;

public interface IDiveable {
    default String dive(int speed) {
        return "You are diving at " + speed + "mph!";
    }

    default String dive(){
         return "You are diving!";
    }

    default String stopDive() {
         return "You've stopped diving";
    }
}
