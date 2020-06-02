package com.practice.interviewBit.Array;

public class MaxAbsoluteDifference {
    public static void main(String[] args) {
        /**
         * You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
         * f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
         * A=[1, 3, -1]
         *
         * f(1, 1) = f(2, 2) = f(3, 3) = 0
         * f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
         * f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
         * f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5
         *
         * So, we return 5.
         */
        int[] arr = {1,3,-1};
        System.out.println(maxArr(arr));
    }

    /**
     * Complexity of this method os O(n) as we can see that it has only one for loop.
     * @param A
     * @return
     */
    static int maxArr(int [] A){
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++)
        {

            max1 = Math.max(max1, A[i] + i);
            min1 = Math.min(min1, A[i] + i);
            max2 = Math.max(max2, A[i] - i);
            min2 = Math.min(min2, A[i] - i);
        }
        return Math.max(max1 - min1, max2 - min2);

    }

    /**
     * This is used to calculate the absolute Differnce in an array element.
     * Although time complexity of this solution in O(n^2)
     * @param A
     * @return
     */
    static int maxArr_On2(int [] A){
        int indexDiffernce = 0;
        int arrayElementDiiference = 0;
        int absarrayElementDiiference = 0;
        int max_ending_here = 0;
        int i=0, j = A.length-1;
        if (A.length ==1){
            return 0;
        }
        for(i = 0; i< A.length; i++){
            for ( j = i+1; j< A.length; j++){
                indexDiffernce = j-i;
                arrayElementDiiference = A[i]-A[j];
                if(arrayElementDiiference < 0){
                    absarrayElementDiiference = arrayElementDiiference * (-1) + indexDiffernce;
                }else{
                    absarrayElementDiiference = arrayElementDiiference + indexDiffernce;
                }
                if(max_ending_here < absarrayElementDiiference){
                    max_ending_here = absarrayElementDiiference;
                }
            }
        }
        return max_ending_here;
    }
}
