package TestQuadraticEquation;

import TestQuadraticEquation.QuadraticEquation;

import static java.lang.Math.sqrt;

public class ParamCarelessTwoRootsOnlyQuadraticEquation extends QuadraticEquation {
    @Override
    public String solve(final double a, final double b, final double c) {
        return String.format("%s %s", (-b + sqrt(b * b - 4 * a * c)) / (2 * a), (-b - sqrt(b * b - 4 * a * c)) / (2 * a));
    }
}
