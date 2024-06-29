package Exercises;

import java.util.Scanner;

public class Question_29 {
    //Checking palindrome using built-in functions
    public static boolean isPalindrome(String str) {
        String reversed_string = new StringBuilder(str).reverse().toString();
        return str.equals(reversed_string);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if palindrome: ");
        String word = scanner.nextLine();
        boolean palindrome = isPalindrome(word);
        if(palindrome){
            System.out.println("This is a palindrome!");
        }else{
            System.out.println("This is not a palindrome!");
        }
    }
}
