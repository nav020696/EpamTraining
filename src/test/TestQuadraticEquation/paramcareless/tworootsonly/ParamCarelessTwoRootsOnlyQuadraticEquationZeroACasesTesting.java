package TestQuadraticEquation.paramcareless.tworootsonly;

import TestQuadraticEquation.ParamCarelessTwoRootsOnlyQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationZeroACasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {
    public ParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }
}
