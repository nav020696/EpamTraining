package TestQuadraticEquation.paramcareful.incapable;

import TestQuadraticEquation.ParamCarefulIncapableQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationZeroACasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarefulIncapableQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {
    public ParamCarefulIncapableQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarefulIncapableQuadraticEquation();
    }
}
