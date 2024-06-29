package Exercises;

import java.util.Scanner;

public class Question_19 {
    public static void Area_circumference ( double radius){
        double area = 2*Math.PI * Math.pow(radius, 2);
        double circumference = 2 * radius * Math.PI;
        System.out.println("The circumference for this circle is " + circumference + "\n The area is: " + area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius for the circle: ");
        double radius = scanner.nextDouble();
        Area_circumference(radius);
    }
}
