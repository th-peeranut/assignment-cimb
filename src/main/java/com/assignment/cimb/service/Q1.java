package com.assignment.cimb.service;

import org.springframework.stereotype.Service;

@Service
public class Q1 {

    public int getMaxProfit(int[] prices) {
        int minPrice = 10000;
        int maxProfit = 0;
        for (int price : prices) {
            // Update the minimum price seen so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate potential profit and update maxProfit if this is greater
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
