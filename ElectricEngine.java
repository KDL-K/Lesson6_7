package com.pvt.carlib;

public class ElectricEngine extends Engine{
    @Override
    public boolean on() {
        System.out.println("ElectricEngine on");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("ElectricEngine off");
        return true;
    }

    @Override
    public boolean changePower(int powerPercent) {
        System.out.println("Change of power by "+powerPercent+"%");
        return true;
    }
}
