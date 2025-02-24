package com.assignment.cimb.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q3Test {

    @Test
    public void testExample1() {
        Q3 q3 = new Q3();
        assertEquals(2, q3.getDistinctWaysClimbStairs(2), "For n = 2, expected 2 ways to climb the stairs");
    }

    @Test
    public void testExample2() {
        Q3 q3 = new Q3();
        assertEquals(3, q3.getDistinctWaysClimbStairs(3), "For n = 3, expected 3 ways to climb the stairs");
    }

    // 1) 1 step + 1 step + 1 step + 1 step
    // 2) 1 step + 1 step + 2 steps
    // 3) 1 step + 2 steps + 1 step
    // 4) 2 steps + 1 step + 1 step
    // 5) 2 steps + 2 steps
    @Test
    public void testExample3() {
        Q3 q3 = new Q3();
        assertEquals(5, q3.getDistinctWaysClimbStairs(4), "For n = 4, expected 3 ways to climb the stairs");
    }
}
