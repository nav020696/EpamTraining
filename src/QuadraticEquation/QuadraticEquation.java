package QuadraticEquation;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        quadraticEquation(a,b,c);

    }

    private static void quadraticEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0){
            System.out.println("no roots");
        }else{
            double x1 = (-b + sqrt(d))/(2*a);
            double x2 = (-b - sqrt(d))/(2*a);
            if (x1 == x2){
                System.out.println(x1);
            }else{
                System.out.println(x1 + " " + x2);
            }
        }
    }
}
