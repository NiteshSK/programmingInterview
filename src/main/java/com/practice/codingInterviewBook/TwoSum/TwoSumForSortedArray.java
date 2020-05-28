package com.mycompany.assessment.java;

public class TwoSumForSortedArray {
/*
* If the Array is Sorted then We can start two point starting to get
* indices for target.
* Complexity for this will be O(n)
* */
   private static int[] twoSum(int[] array,int target){
        int i = 0;
        int j = array.length-1;

        while(i<j) {
            int sum = array[i]+array[j];
            if (sum > target) {
                j--;
            }
            if (sum < target) {
                i++;
            }
            if (sum == target) {
                return new int[]{i, j};
            }
        }
        return null;
    }
}
