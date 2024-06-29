package Exercises;

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.nextLine().charAt(0);
        if(Character.isDigit(character)){
            System.out.println("This character is a digit!");
        }else if(Character.isLetter(character)){
            System.out.println("This character is an alpha letter!");
        }else{
            System.out.println("This character is neither digit nor letter!");
        }
    }
}
