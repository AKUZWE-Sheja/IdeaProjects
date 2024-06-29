package Exercises;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the cube: ");
        double side = scanner.nextDouble();
        double volume = Math.pow(side, 3);
        System.out.println("The volume of this cube is: "+ volume);
    }
}
