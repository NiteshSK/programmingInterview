package com.practice.interviewBit.Array;

import java.util.Arrays;

public class MaxDistance {
    /**
     * Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].
     *
     * If there is no solution possible, return 0.
     *
     * Example :
     *
     * A : [3 5 4 2]
     *
     * Output : 2
     * for the pair (3, 4)
     * @param args
     */
    public static void main(String[] args) {
        int [] arr = {100, 100, 100, 100, 100};
        System.out.println(maximumGap(arr));
    }

    static int maximumGap(final int[] A){
        int maxDiff;
        int i, j;
        int n = A.length;
        if(A.length==1){
            return 0;
        }
        int RMax[] = new int[n];
        int LMin[] = new int[n];

        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = A[0];
        for (i = 1; i < n; ++i)
            LMin[i] = Math.min(A[i], LMin[i - 1]);

        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = A[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = Math.max(A[j], RMax[j + 1]);

        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = -1;
        while (j < n && i < n)
        {
            if (LMin[i] <= RMax[j])
            {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }
        return maxDiff;
    }
}