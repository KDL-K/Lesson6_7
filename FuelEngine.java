package com.pvt.carlib;

public class FuelEngine extends Engine {
    private int cylindersCount;//количество цилиндров
    private float volume;//объем двигателя
    private String fuelType;//вид топлива (бензин, дизель)
    private int powerEngine;//мощность л.с.

    FuelEngine(int cylindersCount, float volume, String fuelType, int powerEngine){
        this.cylindersCount=cylindersCount;
        this.volume=volume;
        this.fuelType=fuelType;
        this.powerEngine=powerEngine;
    }
    private boolean fuelOn() {
        System.out.println("Fuel on");
        return true;
    }
    private boolean fuelOff() {
        System.out.println("Fuel off");
        return true;
    }
    @Override
    public boolean on() {
        fuelOn();
        System.out.println(fuelType+"Engine on");
        return true;
    }

    @Override
    public boolean off() {
        fuelOff();
        System.out.println(fuelType+"Engine off");
        return true;
    }

    @Override
    public boolean changePower(int powerPercent) {
        System.out.println("Change of power by "+powerPercent+"%");
        return true;
    }

    public String toString(){//показать описание двигателя
        return (cylindersCount+" cylinders, "+volume+" l, "+fuelType+", "+powerEngine+" hp.");
    }
}