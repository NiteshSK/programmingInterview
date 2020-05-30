package com.practice.codingInterviewBook.SumProblems.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

/*
* This is the naive Approach
* Time Complexity will be O(n^3)
* @param Input Array, int target
* @return ArrayList of all possible pair
*
* */
    private static ArrayList<ArrayList<Integer>> threeSum(int array[], int target){
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

        for(int i = 0;i<array.length-3;i++){
            for(int j=i+1;j<array.length-2;j++){
                for(int k = j+1;k<array.length-1;k++){
                    if(array[i]+array[j]+array[k] == target){
                        ArrayList<Integer> each = new ArrayList<Integer>();
                        each.add(array[i]);
                        each.add(array[j]);
                        each.add(array[k]);
                        arrayList.add(each);
                    }
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<ArrayList<Integer>> threeSumBetterApproachI(int[] array, int target){
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();


        Arrays.sort(array);

        for(int i = 0;i<array.length-2;i++){

            int start = i+1;
            int end = array.length-1;

            while(start<end){
                if(array[i]+array[start]+array[end]==target){
                    ArrayList<Integer> each = new ArrayList<Integer>();
                    each.add(array[i]);
                    each.add(array[start]);
                    each.add(array[end]);
                    arrayList.add(each);
                    start++;
                    end--;
                }
                else if(array[i]+array[start]+array[end]>target){
                    end--;
                }
                else{
                    start++;
                }
            }
        }

        return arrayList;
    }

    public static ArrayList<ArrayList<Integer>> threeSumBetterApproachII(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3)
            return result;
// sort array
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
// //avoid duplicate solutions
            if (i == 0 || num[i] > num[i - 1]) {
                int negate = -num[i];
                int start = i + 1;
                int end = num.length - 1;
                while (start < end) {
//case 1
                    if (num[start] + num[end] == negate) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[start]);
                        temp.add(num[end]);
                        result.add(temp);
                        start++;
                        end--;
//avoid duplicate solutions
                        while (start < end && num[end] == num[end + 1])
                            end--;
                        while (start < end && num[start] == num[start - 1])
                            start++;
//case 2
                    } else if (num[start] + num[end] < negate) {
                        start++;
//case 3
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }


}
