package lintcode;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPlus {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testPlus() {
        Plus p = new Plus();
        assertEquals(p.plus(0, 0), 0);
        assertEquals(p.plus(0, 2), 2);
        assertEquals(p.plus(1, 2), 3);
        assertEquals(p.plus(10, 10), 20);

        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("beyond");
        p.plus(2147483647, 2147483647);
    }

    @Test
    public void testTrailZeros() {
        ZeroCount zeroCount = new ZeroCount();
        assertEquals(zeroCount.trailingZeros(1), 0);
        assertEquals(zeroCount.trailingZeros(2), 0);
        assertEquals(zeroCount.trailingZeros(3), 0);
        assertEquals(zeroCount.trailingZeros(4), 0);
        assertEquals(zeroCount.trailingZeros(5), 1);
        assertEquals(zeroCount.trailingZeros(6), 1);
        assertEquals(zeroCount.trailingZeros(7), 1);
        assertEquals(zeroCount.trailingZeros(8), 1);
        assertEquals(zeroCount.trailingZeros(9), 1);
        assertEquals(zeroCount.trailingZeros(10), 2);
        assertEquals(zeroCount.trailingZeros(11), 2);
        assertEquals(zeroCount.trailingZeros(1001171717), 250292920);

        assertEquals(zeroCount.calcuFactor2(1), 0);
        assertEquals(zeroCount.calcuFactor2(2), 1);
        assertEquals(zeroCount.calcuFactor2(3), 0);
        assertEquals(zeroCount.calcuFactor2(4), 2);
        assertEquals(zeroCount.calcuFactor2(5), 0);
        assertEquals(zeroCount.calcuFactor2(6), 1);
        assertEquals(zeroCount.calcuFactor2(7), 0);
        assertEquals(zeroCount.calcuFactor2(8), 3);
        assertEquals(zeroCount.calcuFactor2(9), 0);
        assertEquals(zeroCount.calcuFactor2(10), 1);
        assertEquals(zeroCount.calcuFactor2(100), 2);
    }
}
