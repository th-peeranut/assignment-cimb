package com.assignment.cimb.service;

import org.springframework.stereotype.Service;

@Service
public class Q3 {

    // the number of distinct ways to climb to the top follows the Fibonacci sequence
    public int getDistinctWaysClimbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int first = 1;   // ways to climb 1 step
        int second = 2;  // ways to climb 2 steps

        // Starting from step 3 up to n, compute the number of ways iteratively.
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}
