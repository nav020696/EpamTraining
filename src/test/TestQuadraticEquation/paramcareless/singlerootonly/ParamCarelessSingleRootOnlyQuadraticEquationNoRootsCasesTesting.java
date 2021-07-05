package TestQuadraticEquation.paramcareless.singlerootonly;

import TestQuadraticEquation.ParamCarelessSingleRootOnlyQuadraticEquation;
import TestQuadraticEquation.QuadraticEquationNoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting extends QuadraticEquationNoRootsCasesTesting {

    public ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarelessSingleRootOnlyQuadraticEquation();
    }
}
