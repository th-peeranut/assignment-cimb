package com.assignment.cimb.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q1Test {

    @Test
    public void testGetMaxProfitExample1() {
        Q1 q1 = new Q1();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, q1.getMaxProfit(prices1));
    }

    @Test
    public void testGetMaxProfitExample2() {
        Q1 q1 = new Q1();
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, q1.getMaxProfit(prices2));
    }

}
