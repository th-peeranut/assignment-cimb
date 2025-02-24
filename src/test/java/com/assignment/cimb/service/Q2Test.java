package com.assignment.cimb.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q2Test {

    @Test
    public void testEqualVersionsWithLeadingZeros() {
        Q2 q2 = new Q2();
        // "1.01" and "1.001" should be considered equal.
        assertEquals(0, q2.compareVersion("1.01", "1.001"));
    }

    @Test
    public void testEqualVersionsWithTrailingZeros() {
        Q2 q2 = new Q2();
        // "1.0" and "1.0.0" should be considered equal.
        assertEquals(0, q2.compareVersion("1.0", "1.0.0"));
    }

    @Test
    public void testVersionComparisonLessThan() {
        Q2 q2 = new Q2();
        // "0.1" is less than "1.1".
        assertEquals(-1, q2.compareVersion("0.1", "1.1"));
    }

    @Test
    public void testVersionComparisonGreaterThan() {
        Q2 solution = new Q2();
        // "1.2" is greater than "1.1".
        assertEquals(1, solution.compareVersion("1.2", "1.1"));
    }
}
