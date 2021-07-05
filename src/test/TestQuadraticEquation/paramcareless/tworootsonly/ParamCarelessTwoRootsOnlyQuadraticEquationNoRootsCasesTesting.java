package TestQuadraticEquation.paramcareless.tworootsonly;

import TestQuadraticEquation.ParamCarelessTwoRootsOnlyQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationNoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting extends QuadraticEquationNoRootsCasesTesting {

    public ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }
}
