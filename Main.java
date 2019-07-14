package com.pvt.carlib;

public class Main {

    public static void main(String[] args) throws Exception {
	    ElectricEngine electricEngine = new ElectricEngine();
	    Vehicle vehicle = new ElectricCar(4,2,5,1500, electricEngine);

        System.out.println("Is vehicle on = " + vehicle.on());
    }
}
