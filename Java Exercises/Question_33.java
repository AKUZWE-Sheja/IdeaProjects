package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_33 {
    public static boolean is_Prime(int num){
        int flag = 0;
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.print("Enter a prime number: ");
        int number = scanner.nextInt();
        boolean num_prime = is_Prime(number);
        int limit = 1000;
        for(int k=2;k<limit;k++){
            if(is_Prime(k))
                array.add(k);
        }
        //System.out.println(array);
        if(num_prime){
            for (int num:array){
                if(num == number){
                    System.out.println(number + " is the number " + (array.indexOf(num) + 1) + " in the prime numbers!");
                }
            }
        }else{
            System.out.println("This is not a prime number!");
        }

    }
}
