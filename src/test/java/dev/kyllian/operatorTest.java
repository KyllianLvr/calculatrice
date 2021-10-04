package dev.kyllian;

import org.junit.Assert;


public class operatorTest {

    @org.junit.Test
    public void addition() {
        Assert.assertEquals(7, Operator.addition(5, 2));
    }

    @org.junit.Test
    public void substraction() {
        Assert.assertEquals(3, Operator.substraction(5, 2));

    }
}