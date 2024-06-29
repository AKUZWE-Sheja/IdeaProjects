package Exercises;

import java.util.Scanner;

public class Question_24 {
    public static int counter = 0;
    public static int numberOfSpaces (String string) {
        for(int a=0; a< string.length(); a++){
            if(String.valueOf(string.charAt(a)).equals(" ")){
                counter += 1;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = scanner.nextLine();
        int number_of_space = numberOfSpaces(string);
        System.out.println("The number of spaces in this word is " + number_of_space);

    }
}
