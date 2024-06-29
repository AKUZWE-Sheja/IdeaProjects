package Exercises;

import java.util.Scanner;

public class Question_3 {
    public static int number;
    public static int factorial = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to the factorial for: ");
        number = scanner.nextInt();
        for(int a=1; a<=number; a++){
            factorial *= a;
        }
        System.out.println("The factorial for this number is " + factorial);
    }
}
