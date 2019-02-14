package com.company;

public class Vehicle {

    private boolean isEngine;
    private int noOfWheels;

    public Vehicle(boolean isEngine, int noOfWheels) {
        this.isEngine = isEngine;
        this.noOfWheels = noOfWheels;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
