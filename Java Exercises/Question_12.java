package Exercises;

public class Question_12 {
    public static int count = 0;
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Integer pairs (a, b) that satisfy the Pythagorean theorem:");
        for(int a=2;a < limit; a++){
            for(int b=a; b<limit; b++ ){
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if(c * c == cSquared){
                    System.out.println("(" + a + ", " + b + ")");
                    count ++;
                }
            }
        }
        System.out.println("Number of unique pairs found: " + count);
    }
}
