package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_34 {
    public static ArrayList<Integer> factors_of(int num){
        ArrayList<Integer> array = new ArrayList<>();
        for(int j=1;j<=num;j++){
            if(num%j == 0){
                array.add(j);
            }
        }
        return array;
    }
    public static int b,c,min_difference = Integer.MAX_VALUE;
    public static int minDistance (ArrayList<Integer> my_array){
        ArrayList<Integer> differences = new ArrayList<>();
        for(b = my_array.size()-1; b > 0; b--){
            int factor_difference = Math.abs(my_array.get(b) - my_array.get(b-1));
            differences.add(factor_difference);
        }
        //System.out.println(differences);
        for(c = 0; c<differences.size(); c++){
            if(differences.get(c) < min_difference){
                min_difference = differences.get(c);
            }
        }
        return min_difference;
    }
    public static int min_distance;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> my_array = factors_of(number);
        System.out.println(my_array);
        for(int b=0; b<my_array.toArray().length; b++){
            min_distance = minDistance(my_array);
        }
        System.out.println("The minimum difference between the factors of this number is : " + min_distance);
    }
}
