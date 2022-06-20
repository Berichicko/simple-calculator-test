package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void calculation() {
        Sum sum = new Sum(5,3);
        Assert.assertEquals(7,sum.calculation());
    }

    @Test
    public void calculationSecond() {
        Sum sum = new Sum(Integer.MAX_VALUE,Integer.MIN_VALUE);
        Assert.assertEquals(0,sum.calculation());
    }
}