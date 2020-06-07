package com.practice.interviewBit.Array;

public class FirstMissingInteger {
    /**
     * Given an unsorted integer array, find the first missing positive integer.
     *
     * Example:
     *
     * Given [1,2,0] return 3,
     *
     * [3,4,-1,1] return 2,
     *
     * [-8, -7, -6] returns 1
     * @param args
     */
    public static void main(String[] args) {
        int [] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));

    }
    static int firstMissingPositive(int[] A) {
        int n = A.length;
        boolean[] isThere = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n)
                isThere[A[i]] = true;
        }
        for (int i = 1; i <= n; i++)
            if (!isThere[i])
                return i;
        return n + 1;
    }
}
