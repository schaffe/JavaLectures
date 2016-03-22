package ua.kiev.prog.calculator;

import org.junit.Assert;

public class CalculatorTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        Assert.assertTrue(Calculator.add(2, 2) == 4);
    }

    @org.junit.Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(2, Calculator.subtract(4, 2));
    }

    @org.junit.Test
    public void testMultiply() throws Exception {
        Assert.assertFalse(Calculator.multiply(2, 2) == 5);
    }

    @org.junit.Test
    public void testDivide() throws Exception {
        Assert.fail();
    }
}