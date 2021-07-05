package TestQuadraticEquation.paramcareless.tworootsonly;

import TestQuadraticEquation.ParamCarelessTwoRootsOnlyQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationTwoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {

    public ParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final String expected) {
        super(a, b, c, expected);
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }
}
