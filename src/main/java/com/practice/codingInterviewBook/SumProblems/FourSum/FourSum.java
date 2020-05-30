package com.practice.codingInterviewBook.SumProblems.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
/*
* Time Complexity will be O(n^3)
* @input Integer Array
* @Returns gives all possible values in array for a particular target
* */

    private static ArrayList<ArrayList<Integer>> fourSome(int[] array, int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();

        if(array.length<4){
            return result;
        }

        Arrays.sort(array);

        for(int i = 0;i<array.length-3;i++){
            for(int j = i;j<array.length-2;j++){
                int start = j+1;
                int end = array.length-1;

                while (start<end){
                    if(array[i]+array[j]+array[start]+array[end] == target){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(array[i]);
                        temp.add(array[j]);
                        temp.add(array[start]);
                        temp.add(array[end]);
                        start++;
                        end--;

                        if(!hashSet.contains(temp)){
                            hashSet.add(temp);
                        }
                        result.add(temp);
                    }
                    else if(array[i]+array[j]+array[start]+array[end] > target){
                        end--;
                    }
                    else
                    {
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
