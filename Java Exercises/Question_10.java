package Exercises;

public class Question_10 {
    //Product of all odd numbers less between 1 and 20
    public static int num = 1, product = 1;
    public static void main(String[] args) {
        while ( num < 20 ){
            if( num % 2 != 0){
                product *= num;
            }
            num ++ ;
        }
        System.out.println("The product of all odd numbers between 1 and 20 is " + product);
    }
}
