package Exercises;

import java.util.Scanner;

public class Question_28 {
    public static int index=0;
    public static int str_len= 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        while(string.charAt(index) != '\u0000'){
            str_len ++;
            index ++;
        }
        System.out.println("The length of this string is: " + str_len);
    }
}
