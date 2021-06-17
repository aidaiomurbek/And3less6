package com.example.and3less6;

import com.example.and3less6.domain.Math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    Math math;

    @Before
    public void serUp() {
        math = new Math();
        System.out.println("before");
    }

    @Test
    public void addTest() {
        assertEquals(4, math.add(2, 2));
    }

    @Test
    public void multiplyTest() {
        assertEquals(6, math.multiply(2, 3));
    }

    @Test
    public void divTest() {
        assertEquals(10, math.div(50, 5));
    }

    @Test
    public void minusTest() {
        assertEquals(5, math.minus(7, 2));
    }

    @Test
    public void degree() {
        assertEquals(729, math.degrate(9, 3));
    }

    @After
    public void clearUp() {
        System.out.println("after");
    }


}