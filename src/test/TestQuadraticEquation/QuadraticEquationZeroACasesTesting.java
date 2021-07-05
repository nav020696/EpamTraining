package TestQuadraticEquation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0,-563,-5 }, { 0,10,30}, {0, 11, 111}, {0,2,2}, {0, 1, -50}
        });
    }

    private double a;
    private double b;
    private double c;

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoRootsCase() {
        quadraticEquation.solve(a, b, c);
    }
}
