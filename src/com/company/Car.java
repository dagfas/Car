package com.company;

public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    private int initialSpeed;


    public Car(String model, String color) {
        super(true, 4);
        this.model = model;
        this.color = color;
        this.initialSpeed = 0;
    }

    public void accelerate(int speed) {
        System.out.println("The " + color + " " + model + " is going " + speed + " mph.");
    }

    public void hasEngine(boolean engine) {
        if (engine) {
            System.out.println("The " + color + " " + model + " has an engine.");
        } else {
            System.out.println("The " + color + " " + model + " doesn't have engine installed yet");
        }
    }



    public void stop() {
        System.out.println("The car has stopped");
    }


    public void isStarting() {
        System.out.println("The " + color + " " + model + " is starting.");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
