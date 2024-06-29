    package Exercises;

    import java.util.ArrayList;
    //Product of prime numbers between 1 and 100
    public class Question_11 {
        public static int num = 100,flag = 0, product = 1, i;
        public static void main(String[] args) {
            ArrayList<Integer> array = new ArrayList<>();
            for (i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }
            }
            for(int c=0; c < num; c++){
                if (flag == 0) {
                    array.add(num);
                }
            }

            for (int b = 0; b < array.toArray().length; b++) {
                if (array.indexOf(b) > 1 && array.indexOf(b) < 100) {
                    product *= array.indexOf(b);
                }
            }
            System.out.println("The product of all prime numbers from 1 to 100 is " + product);
        }
    }
