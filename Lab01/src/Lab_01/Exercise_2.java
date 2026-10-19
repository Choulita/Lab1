package Lab_01;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("           Welcome to our program");
        System.out.println("'Quadratic Equation Solver ax² + bx + c = 0'");
        System.out.println("============================================");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Input a: ");
        a = sc.nextInt();

        System.out.print("Input b: ");
        b = sc.nextInt();

        System.out.print("Input c: ");
        c = sc.nextInt();

        System.out.println();

        System.out.println("---------------------------------------------");
        System.out.println("Roots of this equation: " + a + "x² + "
                + b + "x + " + c + " = 0 are:");

        double delta;
        delta = b * b - 4.0 * a * c;

        double x1, x2, x;

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        }
        else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }
        else if (delta == 0) {
            x = -b / (2.0 * a);

            System.out.println("x = " + x);
        }
        else {
            System.out.println("Delta is negative, so the roots are complex.");

            double P = -b / (2.0 * a);
            double Q = Math.sqrt(-delta) / (2 * a);

            System.out.println("x1 = " + P + " + " + Q + "i");
            System.out.println("x2 = " + P + " - " + Q + "i");
        }

        System.out.println("---------------------------------------------");
    }
}

