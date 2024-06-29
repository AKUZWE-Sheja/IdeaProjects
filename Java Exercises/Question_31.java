package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args) {
        //Removing all spaces
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        for(int a =0; a<string.length(); a++) {
            if (!(String.valueOf(string.charAt(a)).equals(" "))) {
                list.add(String.valueOf(string.charAt(a)));
            }
        }
        String new_string = String.join("", list);
        System.out.println("The new String without spaces: " + new_string);
    }
}
