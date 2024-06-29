package Exercises;

import java.util.Scanner;

public class Question_15 {
    public static void quotient_remainder(double num1, double num2){
        double quotient = num1/num2;
        double remainder = num1 % num2;
        System.out.println("The quotient of these two numbers is: " + quotient + "\nThe remainder is: "+ remainder);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        double num2 = scanner.nextInt();
        quotient_remainder(num1, num2);

    }
}
