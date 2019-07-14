package com.pvt.carlib;

public abstract class Engine {
    private int power=0;

    public abstract boolean on();
    public abstract boolean off();
    public abstract boolean changePower(int powerPercent);

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
