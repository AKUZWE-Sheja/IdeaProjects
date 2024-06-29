package Exercises;

public class Question_23 {
    public static long years,seconds = 1000000000;
    final public static long seconds_in_one_year = 3600 * 24 * 365;
    public static void main(String[] args) {
        years = seconds/ seconds_in_one_year;
        System.out.println("John is " + years + " years old!");
    }
}
