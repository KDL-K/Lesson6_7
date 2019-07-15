package com.pvt.carlib;

public class Main {

    public static void main(String[] args) throws Exception {
	    ElectricEngine electricEngine = new ElectricEngine();
	    Body body=new Body("Sedan","silver",4,true);
	    Vehicle vehicle = new ElectricCar(4,2,5,1500, electricEngine, body);

	    System.out.println(vehicle.toString());
	    System.out.println("Is vehicle on = " + vehicle.on());
        vehicle.turnRight(15);
        vehicle.turnLeft(0);
        System.out.println("Is vehicle off = " + vehicle.off());
        vehicle.openDoor(1);
        vehicle.closeDoor(1);

        FuelEngine fuelEngine = new FuelEngine(4,1.6f,"petrol",115);
        body=new Body("Coupe","red",3,false);
        vehicle = new FuelCar(4,2,4,1600, fuelEngine, body);

        System.out.println();
        System.out.println(vehicle.toString());
        System.out.println("Is vehicle on = " + vehicle.on());
        vehicle.turnRight(15);
        vehicle.turnLeft(0);
        System.out.println("Is vehicle off = " + vehicle.off());
        vehicle.openDoor(1);
        vehicle.closeDoor(1);
    }
}
