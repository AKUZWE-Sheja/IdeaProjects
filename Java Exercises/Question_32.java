package Exercises;

import java.util.Scanner;

public class Question_32 {

    public static char choice;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                MENU
                1.Add
                2.Subtract\s
                3.Multiply\s
                4.Divide\s
                5.Modulus\s
                """);
        do {
            System.out.print("Enter your choice: ");
            int operator = scanner.nextInt();
            System.out.print("Enter your two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            switch (operator) {
                case 1 -> System.out.println("Result: " + (num1 + num2));
                case 2 -> System.out.println("Result: " + (num1 - num2));
                case 3 -> System.out.println("Result: " + (num1 * num2));
                case 4 -> System.out.println("Result: " + (num1 / num2));
                case 5 -> System.out.println("Result: " + (num1 % num2));
            }
            System.out.println("Do you want to continue ? Y/N");
            choice = scanner.next().charAt(0);
        }while (choice == 'Y');
    }

}
