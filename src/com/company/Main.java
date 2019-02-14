package com.company;

public class Main {


    private String model;
    private boolean isPassed;
    private String speed;

    public static void main(String[] args) {


        Car porsche = new Car("commodore", "black");

        porsche.hasEngine(true);
        porsche.isStarting();
        porsche.accelerate(90);
        porsche.stop();







    }



}
