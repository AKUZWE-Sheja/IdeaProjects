package Exercises;

public class Question_2 {
    public static int sum =0 ,number =0;
    public static void main(String[] args) {
        while(number < 10){
            sum += number;
            number ++;
        }
        System.out.println("The sum of the first ten natural numbers is " + sum);
    }
}
