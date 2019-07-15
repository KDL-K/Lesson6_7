package com.pvt.carlib;

public class FuelCar extends Vehicle {
    public FuelCar(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Body body) throws Exception {
    super(wheelCount, axisCount, seatCount, weight, engine, body);
}

    @Override
    public boolean on() {
        super.on();
        System.out.println("Activate all electronic systems");
        System.out.println("Car started");
        return true;
    }

    @Override
    public boolean off() {
        super.off();
        System.out.println("Car stopped");
        System.out.println("Deactivate all electronic systems");
        return true;
    }

    @Override
    public boolean upSpeed(int powerPercent) {
        boolean result=getEngine().changePower(powerPercent);
        getEngine().setPower(getEngine().getPower()*(1+powerPercent/100));
        System.out.println("Power is upped to "+getEngine().getPower());
        return true;
    }

    @Override
    public boolean downSpeed(int powerPercent) {
        boolean result=getEngine().changePower(powerPercent);
        getEngine().setPower(getEngine().getPower()*(1-powerPercent/100));
        System.out.println("Power is lowered to "+getEngine().getPower());
        return true;
    }

    public void openDoor(int doorNumber){
        getBody().openDoor(doorNumber);
    }

    public void closeDoor(int doorNumber){
        getBody().closeDoor(doorNumber);
    }

}