package Exercises;

import java.util.Scanner;

public class Question_13 {
    public static double a, b, c, root1, root2, square;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a exponents: ");
        a = scanner.nextDouble();
        System.out.print("Enter the b exponents: ");
        b = scanner.nextDouble();
        System.out.print("Enter the c exponents: ");
        c = scanner.nextDouble();

        square = Math.pow(b, 2) - (4 * a * c);
        if (square > 0) {
            double square_root = Math.sqrt(square);
            root1 = ((b * -1) + square_root) / (2 * a);
            root2 = ((b * -1) - square_root) / (2 * a);
        } else {
            root1 = root2 = 0;
        }
        System.out.println("The root X1 = " + root1 + "\nThe root X2 = " + root2);
    }
}
