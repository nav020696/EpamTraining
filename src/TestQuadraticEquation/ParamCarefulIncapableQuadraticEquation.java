package TestQuadraticEquation;

import TestQuadraticEquation.QuadraticEquation;

public class ParamCarefulIncapableQuadraticEquation extends QuadraticEquation {
    @Override
    public String solve(final double a, final double b, final double c) {
        if (a == 0)
            throw new IllegalArgumentException();
        return "no roots";
    }
}
