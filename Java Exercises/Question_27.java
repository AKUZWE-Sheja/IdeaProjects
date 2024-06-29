package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_27 {
    public static int a;
    public static String new_word;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to reverse: ");
        String word = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (a =word.length()-1; a>=0 ;a--) {
            list.add(String.valueOf(word.charAt(a)));
        }
        System.out.println(list);
        String reversed_word = String.join("", list);
        System.out.println("The reversed word is " + reversed_word);
    }
}
