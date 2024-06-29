package Exercises;

import java.util.Scanner;

public class Question_35 {
    public static int counter;
    public static int countDigit(int number, int number_appeared) {
        String number_split = Integer.toString(number);
        String[] number_to_string = number_split.split("");
        for (String s : number_to_string) {
            if (Integer.parseInt(s) == number_appeared) {
                counter++;
            }
        }
        return counter;

    }
    public static int countingDigits;
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the digit you want to check: ");
        int digit = scanner.nextInt();
        if(num<0){
            System.out.println(-1);
        }else{
            countingDigits = countDigit(num, digit);
        }
        System.out.println("The number you entered appeared " + countingDigits + " times!");
    }
}
