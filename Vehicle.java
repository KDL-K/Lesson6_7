package com.pvt.carlib;



import java.util.Objects;

public abstract class Vehicle implements VehicleControl {
    private int wheelCount;
    private int axisCount;
    private int seatCount;
    private int weight;

    private final Engine engine;
    private final Body body;

    public Vehicle(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Body body) throws Exception {
        this.wheelCount = wheelCount;
        this.axisCount = axisCount;
        this.seatCount = seatCount;
        this.weight = weight;

        if(engine != null) {
            this.engine = engine;
        }else {
            throw new Exception();
        }

        if(body != null) {
            this.body = body;
        }else {
            throw new Exception();
        }
    }

    public boolean on(){
        boolean result = engine.on();
        System.out.println("Vehicle start");
        return result;
    };
    public boolean off(){
        boolean result = engine.off();
        System.out.println("Vehicle stop");
        return result;
    }
    public boolean turnRight(int turnDegree){
        if(turnDegree==0){
            System.out.println("Go directly.");
        }else {
            System.out.println("Turned to the right by " + turnDegree + " degree.");
        }
        return true;
    }
    public boolean turnLeft(int turnDegree){
        if(turnDegree==0){
            System.out.println("Go directly.");
        }else {
            System.out.println("Turned to the left by " + turnDegree + " degree.");
        }
        return true;
    }
    public abstract boolean upSpeed(int powerPercent);
    public abstract boolean downSpeed(int powerPercent);
    public abstract void openDoor(int doorNumber);
    public abstract void closeDoor(int doorNumber);

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getAxisCount() {
        return axisCount;
    }

    public void setAxisCount(int axisCount) {
        this.axisCount = axisCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheelCount=" + wheelCount +
                ", axisCount=" + axisCount +
                ", seatCount=" + seatCount +
                ", weight=" + weight +
                ", engine:" + engine +
                ", body:" + body +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return wheelCount == vehicle.wheelCount &&
                axisCount == vehicle.axisCount &&
                seatCount == vehicle.seatCount &&
                weight == vehicle.weight &&
                Objects.equals(engine, vehicle.engine) &&
                        Objects.equals(body, vehicle.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelCount, axisCount, seatCount, weight, engine, body);
    }
}
