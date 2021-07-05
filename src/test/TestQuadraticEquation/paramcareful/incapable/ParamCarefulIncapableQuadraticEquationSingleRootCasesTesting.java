package TestQuadraticEquation.paramcareful.incapable;

import TestQuadraticEquation.ParamCarefulIncapableQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationSingleRootCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting extends QuadraticEquationSingleRootCasesTesting {

    public ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting(final double a, final double b, final double c, final double expected) {
        super(a, b, c, expected);
        quadraticEquation = new ParamCarefulIncapableQuadraticEquation();
    }
}
