package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a Benz object
            Car benz = new Car("Black", 5, 1200, 1500);

            try (ObjectOutputStream carObj = new ObjectOutputStream(new FileOutputStream("carObject.ser"))) {
                carObj.writeObject(benz);
            }

            try (ObjectInputStream serRidicule = new ObjectInputStream(new FileInputStream("carObject.ser"))) {
                Car myCar = (Car) serRidicule.readObject();
                System.out.println("My Benz - Color: " + myCar.getColor() +
                        ", Seats Number: " + myCar.getNumberOfSeats() +
                        ", Min Height: " + myCar.getMinimumHeight() +
                        ", Max Height: " + myCar.getMaximumHeight());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (SeatNumberException | IOException e) {
            e.printStackTrace();
        }
    }
}
