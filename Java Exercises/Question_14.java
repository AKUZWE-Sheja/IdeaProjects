package Exercises;

import java.util.Scanner;

public class Question_14 {
    public static double celsius_to_fahrenheit(double celsius){
        return (celsius * 9/5)+ 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the celsius scale value: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius_to_fahrenheit(celsius);
        System.out.println("The corresponding value in fahrenheit is: " + fahrenheit);
    }
}
