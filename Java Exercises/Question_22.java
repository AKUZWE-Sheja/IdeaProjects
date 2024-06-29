package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_22 {
    //Checking if a word is a palindrome
    public static int a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if palindrome: ");
        String word = scanner.next();
        ArrayList<String> new_Word = new ArrayList<>();
        for (a =word.length()-1; a>=0 ;a--) {
             new_Word.add(String.valueOf(word.charAt(a)));
        }
        String reversed_Word = String.join("", new_Word);
        if(word.equals(reversed_Word)){
            System.out.println("This is a palindrome!");
        }else{
            System.out.println("This is not a palindrome!");
        }
    }
}
