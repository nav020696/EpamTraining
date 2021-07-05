package TestQuadraticEquation;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0){
            throw new IllegalArgumentException("First parameter can't be zero");
        }
        double d = b * b - 4 * a * c;
        if (d < 0){
            return "no roots";
        }else{
            double x1 = (-b + sqrt(d))/(2*a);
            double x2 = (-b - sqrt(d))/(2*a);
            if (x1 == x2){
                return x1 + "";
            }else{
                return x1 + " " + x2;
            }
        }
    }
}

