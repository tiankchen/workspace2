package lintcode;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseTest {

    @Test
    public void testBitwise() {

        int i = 0;
        int tmp = 0;

        //1. test >>
        i = 0b0010;

        tmp = i >> 1;
        Assert.assertEquals(tmp, 0b0001);

        tmp = i >> 2;
        Assert.assertEquals(tmp, 0b0000);

        tmp = i << 1;
        Assert.assertEquals(tmp, 0b0100);

        tmp = i << 29;
        Assert.assertEquals(tmp, 0x40000000);

        tmp = i << 30;
        int a = 0x80000000;
        int b = 0x00000000;

        Assert.assertEquals(tmp, a);
        Assert.assertEquals(a, Integer.MIN_VALUE);
        Assert.assertEquals(a, -2147483648);

        i = 0x40000000;
        tmp = i << 1;
        Assert.assertEquals(tmp, a);

        i = 0x80000004;
        tmp = i >> 1;
        Assert.assertEquals(tmp, 0xc0000002);

        int b1 = -1;
        int b2 = -2;

        // i = 0x80000001;
        i = -1;
        tmp = i << 1;
        Assert.assertEquals(tmp, 2);
    }
}
