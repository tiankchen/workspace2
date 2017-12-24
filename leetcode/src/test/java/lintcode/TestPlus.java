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
}
