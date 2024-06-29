package Exercises;

import java.util.Scanner;

public class Question_21 {
    public static void Ascending(int num1, int num2, int num3){
        System.out.print("The numbers in ascending order: ");
        if(num1<=num2 && num2<=num3){
            System.out.println(num1 + "," + num2 + "," + num3);
        }else if (num1<=num3 && num3 <= num2) {
            System.out.println(num1 + "," + num3 + "," + num2);
        } else if(num2 <= num1 && num1<=num3){
            System.out.println(num2 + "," + num1 + "," + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + "," + num3 + "," + num1);
        } else if (num1 <=num2 && num2>= num3) {
            System.out.println(num3 + "," + num1 + "," + num2);
        }else{
            System.out.println(num3 + "," + num2 + "," + num1);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = scanner.nextInt();
        Ascending(num1,num2,num3);
        /*
        *  if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Ensure num2 is the middle number
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + ", " + num2 + ", " + num3);
    }*/
    }
}
