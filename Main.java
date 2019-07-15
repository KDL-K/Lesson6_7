package com.pvt.carlib;

public class Main {

    public static void main(String[] args) throws Exception {
	    ElectricEngine electricEngine = new ElectricEngine();
	    Body body=new Body("Sedan","silver",4,true);
	    VehicleControl control = new ElectricCar(4,2,5,1500, electricEngine, body);

	    System.out.println(control);
	    System.out.println("Is vehicle on = " + control.on());
        control.turnRight(15);
        control.turnLeft(0);
        System.out.println("Is vehicle off = " + control.off());
        control.openDoor(1);
        control.closeDoor(1);

        FuelEngine fuelEngine = new FuelEngine(4,1.6f,"petrol",115);
        body=new Body("Coupe","red",3,false);
        control = new FuelCar(4,2,4,1600, fuelEngine, body);

        System.out.println();
        System.out.println(control);
        System.out.println("Is vehicle on = " + control.on());
        control.turnRight(15);
        control.turnLeft(0);
        System.out.println("Is vehicle off = " + control.off());
        control.openDoor(1);
        control.closeDoor(1);
    }
}
