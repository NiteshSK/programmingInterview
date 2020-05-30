package com.practice.codingInterviewBook.Array;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Input: {1,3,5,7,9,-1}
 * target sum = 8
 * Expected Output: {{0,3},{1,2},{4,5}}
 * */
public class TwoSum {
    public static void main(String [] args){
        int[] sampleInput = {1,3,5,7,9,-1} 
        int target = 8;
        TwoSum.getTwoSumNaive(sampleInput,target);
        TwoSum.getTwoSumByBetterApproach(sampleInput,target)
    }

    /*
     * The Below Approach is Naive.
     * In This Time Complexity will be O(n^2)
     * As We have to Use two "For" Loops
     * */
    private static int[] getTwoSumNaive(int[] array,int target){
        int[] ret = new int[2];
        for(int i=0;i<array.length-1;i++){
            for(int j =0;j<array.length;j++){
                if(array[i]+array[j]==target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;

    }

    /*
     * This is Better Approach
     * Time Complexity will be O(n).
     * We will use HashMap for getting the indices whose sum is the target sum
     * */
    private static int[] getTwoSumByBetterApproach(int[] array, int target){
        if(array == null || array.length == 0){
            return null;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int[] ret = new int[2];
        for(int i = 0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                ret[0] = hashMap.get(array[i]);
                ret[1] = i;
                return ret;
            }
            hashMap.put(target-array[i],i);
        }
        return ret;
    }
}
