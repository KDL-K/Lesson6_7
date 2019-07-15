package com.pvt.carlib;

public interface VehicleControl {
    boolean on();
    boolean off();
    boolean turnRight(int turnDegree);
    boolean turnLeft(int turnDegree);
    boolean upSpeed(int powerPercent);
    boolean downSpeed(int powerPercent);
    void openDoor(int doorNumber);
    void closeDoor(int doorNumber);
}
