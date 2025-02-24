package com.assignment.cimb.service;

import org.springframework.stereotype.Service;

@Service
public class Q2 {

    public int compareVersion(String version1, String version2) {
        String[] v1Revisions = version1.split("\\.");
        String[] v2Revisions = version2.split("\\.");
        int length = Math.max(v1Revisions.length, v2Revisions.length);

        for (int i = 0; i < length; i++) {
            // Parse the revision or treat as 0 if the revision is missing.
            int num1 = i < v1Revisions.length ? Integer.parseInt(v1Revisions[i]) : 0;
            int num2 = i < v2Revisions.length ? Integer.parseInt(v2Revisions[i]) : 0;

            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }

        return 0;
    }
}
