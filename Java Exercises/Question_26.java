package Exercises;

import java.util.Scanner;

public class Question_26 {
    public static int counter_without_spaces = 0;
    public static int counter_with_spaces = 0;
    public static int counter_of_spaces = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String words = scanner.nextLine();
        for(int a=0; a< words.length(); a++){
            counter_with_spaces += 1;
            if(!(String.valueOf(words.charAt(a)).equals(" "))){
                counter_without_spaces += 1;
            }
        }
        System.out.println("The number of characters without spaces is: " + counter_without_spaces);
        System.out.println("The number of characters with spaces is: " + counter_with_spaces);
        for(int a=0; a< words.length(); a++){
            if(String.valueOf(words.charAt(a)).equals(" ")){
                counter_of_spaces += 1;
            }
        }
        System.out.println("The number of spaces is : " + counter_of_spaces);

    }
}
