package org.example;

import java.io.Serializable;

class Car implements Serializable, RadioTv {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMinimumHeight() {
        return minimumHeight;
    }

    public void setMinimumHeight(int minimumHeight) {
        this.minimumHeight = minimumHeight;
    }

    public int getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(int maximumHeight) {
        this.maximumHeight = maximumHeight;
    }

    private String color;
    private int numberOfSeats;
    private int minimumHeight;
    private int maximumHeight;

    public Car(String color, int numberOfSeats, int minimumHeight, int maximumHeight) throws SeatNumberException {
        if (numberOfSeats > 100) {
            throw new SeatNumberException("The number of seats is beyond 100");
        }
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.minimumHeight = minimumHeight;
        this.maximumHeight = maximumHeight;
    }

    @Override
    public double watchTelevision() {
        return 0;
    }

    @Override
    public void playRadio() {
        System.out.println("Playing radio in the car");
    }
}