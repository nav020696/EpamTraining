package TestQuadraticEquation.paramcareless.singlerootonly;

import TestQuadraticEquation.ParamCarelessSingleRootOnlyQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationZeroACasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {
    public ParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarelessSingleRootOnlyQuadraticEquation();
    }
}
