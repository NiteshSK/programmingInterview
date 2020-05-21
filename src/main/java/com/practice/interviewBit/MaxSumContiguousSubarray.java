package com.practice.interviewBit;

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
    static int maxSubArray(int[] A) {
        int max_so_long = 0;
        int max_ending_here = 0;
        for(int i =0; i<A.length; i++){
            max_ending_here = max_ending_here+A[i];
            if(max_ending_here < 0 ) {
                max_so_long = max_ending_here;
            }

            if(max_so_long < max_ending_here){
                max_so_long = max_ending_here;
            }
        }
        System.out.println(max_so_long);
        return max_so_long;
    }
}
