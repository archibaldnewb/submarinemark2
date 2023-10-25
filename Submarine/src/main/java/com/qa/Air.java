package com.qa;

import com.qa.exceptions.InvalidKillcountValue;

public abstract class Air extends MilitaryVehicle implements IDiveable {

    public Air(String name, int age, int killCount, OWNER owner) throws InvalidKillcountValue {
        super(name, age, killCount, owner);
    }

    @Override
    public String shootMain() {
        return "Shoots from air!";
    }

    @Override
    public String dive() {
        return "Diving from the air!";
    }
}
