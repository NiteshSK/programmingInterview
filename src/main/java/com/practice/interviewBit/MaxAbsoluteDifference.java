package com.practice.interviewBit;

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
    static int maxArr(int [] A){
        int indexDiffernce = 0;
        int arrayElementDiiference = 0;
        int absarrayElementDiiference = 0;
        int max_ending_here = 0;
        int i=0, j = A.length-1;
        if (A.length ==1){
            return 0;
        }
        while(i<j){


            System.out.println("j : "+j+" : i :"+i);
            j--;
            i++;

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
//                System.out.println("indexDiffernce : "+indexDiffernce+ ": absarrayElementDiiference :"+absarrayElementDiiference);
                if(max_ending_here < absarrayElementDiiference){
                    max_ending_here = absarrayElementDiiference;
                }
            }
        }
        return max_ending_here;
    }
}
