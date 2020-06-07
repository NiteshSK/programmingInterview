package com.practice.interviewBit.Array;

import java.util.HashSet;

public class FindDuplicateinArray {
    /**
     * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
     *
     * Sample Input:
     *
     * [3 4 1 4 1]
     * Sample Output:
     *
     * 1
     * If there are multiple possible answers ( like in the sample case above ), output any one.
     *
     * If there is no duplicate, output -1
     * @param args
     */
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,1};
        System.out.println(repeatedNumber(arr));
    }
    static int repeatedNumber(final int[] A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int out = -1;
        for(int i = 0; i<A.length; i++){
            if(!hs.contains(A[i])) {
                hs.add(A[i]);
            }else{
                out = A[i];
            }
        }
        return out;
    }
}
