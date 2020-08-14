package com.example.android_poplibs;

import com.example.android_poplibs.unit.Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void prepare() {
        calculator = new Calculator();
    }

    @Test
    public void test1() {
        Assert.assertEquals(calculator.sum(2, 2), 4);
    }

    @Test
    public void test2() {
        Assert.assertEquals(calculator.sum(2, 2), 5);
    }

}
