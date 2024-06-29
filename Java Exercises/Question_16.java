package Exercises;

import java.util.Scanner;
public class Question_16 {
    public static void is_positive(int number){
    	if(number > 0){
            System.out.println("This number is positive");
	    }else if(number == 0 ){
            System.out.println("This number is zero !");
	    }else{
            System.out.println("This number is negative!");
	    }
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        is_positive(number);
    }
}
