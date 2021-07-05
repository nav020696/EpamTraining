package TestQuadraticEquation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 5, -3, "-3.0 0.5"}, {1, -3, 1, "0.3819660112501051 2.618033988749895"},
                {2, -38, 156, "6.0 13.0"}, {-0.5, 34, 1046.5, "-23.0 91.0"}, {-3, 0, 75, "-5.0 5.0"}
        });
    }

    private double a;
    private double b;
    private double c;
    private String expected;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testTwoRootsCase() {
        String result = quadraticEquation.solve(a, b, c);
        assertTrue(result.matches("[\\d\\s.-]+"));
        String[] words = result.split(" ");
        assertEquals(2, words.length);
        double res1 = Double.parseDouble(words[0]);
        double res2 = Double.parseDouble(words[1]);
        String strResult;
        if (res1 < res2){
            strResult = res1 + " " + res2;
        }else{
            strResult = res2 + " " + res1;
        }
        assertEquals(expected, strResult);
    }
}

