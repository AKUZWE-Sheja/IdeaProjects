package Exercises;

import java.util.Scanner;

public class Question_18 {
    public static void user_Names(String firstname, String lastname){
        System.out.println("Firstname : " + firstname);
        System.out.println("Lastname : " + lastname);
        System.out.print("Name in reverse is: ");
        System.out.print(lastname + " ");
        System.out.print(firstname);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the firstname: ");
        String firstname = scanner.next();
        System.out.print("Enter the lastname: ");
        String lastname = scanner.next();
        user_Names(firstname, lastname);
    }
}
