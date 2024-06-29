package org.example;

import java.io.Serializable;
class Benz extends Car implements AirConditioner, Serializable {
    public Benz(String color, int numberOfSeats, int minimumHeight, int maximumHeight) throws SeatNumberException {
        super(color, numberOfSeats, minimumHeight, maximumHeight);
//        int minimumHeightHeight = 200;
//        int maximumHeightHeight = 500;
    }
    public void setMinimumHeight(int minimumHeight) {
        this.setMinimumHeight(200);
    }

    public void setMaximumHeight(int maximumHeight) {
        this.setMinimumHeight(500);
    }

    @Override
    public void manageTemperature() {
    }
}

