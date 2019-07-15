package com.pvt.carlib;

public class Body {
    private String bodyType;//вид кузова(sedan, hatchback, wagon)
    private String colour;//цвет кузова
    private int doorCount;//количество дверей
    private boolean isZincBody;// наличие оцинкованного кузова (false, true)

    public Body(String bodyType, String colour, int doorCount, boolean isZincBody) {
        this.bodyType = bodyType;
        this.colour = colour;
        this.doorCount = doorCount;
        this.isZincBody = isZincBody;
    }
    public void openDoor(int doorNumber){// номер двери 1, 2, 3,... doorCount
        if(doorNumber>=doorCount || doorNumber<=0){
            System.out.println("Incorrect number of the door");
            return;
        }
        System.out.println("The "+doorNumber+" door is opened.");
    }
    public void closeDoor(int doorNumber){// номер двери 1, 2, 3,... doorCount
        if(doorNumber>=doorCount || doorNumber<=0){
            System.out.println("Incorrect number of the door");
            return;
        }
        System.out.println("The "+doorNumber+" door is closed.");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public boolean isZincBody() {
        return isZincBody;
    }

    public void setZincBody(boolean zincBody) {
        isZincBody = zincBody;
    }

    public String toString(){//выводим описание кузова
        return (bodyType+", "+colour+", "+((isZincBody==true)?"galvanized":"not galvanized")+
                ", "+doorCount+" doors;");
    }
}