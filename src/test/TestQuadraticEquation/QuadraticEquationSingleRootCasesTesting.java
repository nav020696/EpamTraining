package TestQuadraticEquation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -2, 1, 1.0}, {1, 12, 36, -6.0}, {1, 6, 9, -3.0}, {1, -6, 9, 3.0}, {1, -12, 36, 6.0}
        });
    }

    private double a;
    private double b;
    private double c;
    private double expected;

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testSingleRootsCase() {
        String result = quadraticEquation.solve(a, b, c);
        assertTrue(result.matches("[\\d.-]+"));
        double res = Double.parseDouble(result);
        assertThat(res, is(expected));
    }
}

