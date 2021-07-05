package TestQuadraticEquation;

import static java.lang.Math.sqrt;

public class ParamCarefulTwoRootsReversedOrderQuadraticEquation extends QuadraticEquation {
    @Override
    public String solve(final double a, final double b, final double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        return String.format("%s %s", (-b - sqrt(b * b - 4 * a * c)) / (2 * a), (-b + sqrt(b * b - 4 * a * c)) / (2 * a));
    }
}
