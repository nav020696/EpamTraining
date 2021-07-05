package TestQuadraticEquation.paramcareful.tworootsreversed;

import TestQuadraticEquation.ParamCarefulTwoRootsReversedOrderQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationZeroACasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {
    public ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }
}
