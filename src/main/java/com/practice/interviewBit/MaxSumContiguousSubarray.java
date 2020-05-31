package com.practice.interviewBit;

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        /**
         * Should run for these cases : {-89, -277, -475, -480, -420}
         *                  {-163,20}
         */
        int[] arr = {-89, -277, -475, -480, -420};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] A) {
        int max_so_long = 0;
        int max_ending_here = 0;
        if (checkOnlyNegative(A) == true) {
            max_so_long = A[0];
            if (A.length == 1) {
                return max_so_long;
            }
            for (int i = 1; i < A.length; i++) {
                if(max_so_long < A[i]){
                    max_so_long = A[i];
                }
            }
            return max_so_long;
        }
        for (int i = 0; i < A.length; i++) {
            max_ending_here = max_ending_here + A[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }

            if (max_so_long < max_ending_here) {
                max_so_long = max_ending_here;
            }
        }
        return max_so_long;
    }
    static boolean checkOnlyNegative(int []A){
        int checkNegative = 0;
        for(int i =0; i<A.length;i++){
            if(A[i]<0){
                checkNegative = checkNegative+1;
            }

        }
        if(checkNegative == A.length){
            return true;
        }
        return false;
    }
}
