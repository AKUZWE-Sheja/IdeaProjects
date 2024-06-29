package Exercises;

import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to turn to uppercase: ");
        String string = scanner.nextLine();
        String uppercase_string = string.toUpperCase();
        System.out.println("The string to uppercase is: "+ uppercase_string);
    }
}
