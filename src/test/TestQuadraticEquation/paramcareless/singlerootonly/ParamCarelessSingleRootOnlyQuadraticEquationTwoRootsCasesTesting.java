package TestQuadraticEquation.paramcareless.singlerootonly;

import TestQuadraticEquation.ParamCarelessSingleRootOnlyQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationTwoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {

    public ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final String expected) {
        super(a, b, c, expected);
        quadraticEquation = new ParamCarelessSingleRootOnlyQuadraticEquation();
    }
}
