package com.practice.interviewBit.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatAndMissing {
    /**
     * Input: arr[] = {3, 1, 3}
     * Output: Missing = 2, Repeating = 3
     * Explanation: In the array,
     * 2 is missing and 3 occurs twice
     *
     * Input: arr[] = {4, 3, 6, 2, 1, 1}
     * Output: Missing = 5, Repeating = 1
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 1, 1,10};
        getR(arr);
    }

    static int [] getR(int [] A) {

        HashMap<Integer, Boolean> numberMap = new HashMap<Integer, Boolean>();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        int max = A.length;
        //Used HashMap to check that the integer is repeating or not.
        for (Integer i : A) {
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                aList.add(i);
                System.out.println("Repeating = " + i);
            }
        }
        //this is for missing number
        //looping an array till the length of it and checking it in Map
        //if it is not there seems missing in an array.
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                aList.add(i);
                System.out.println("Missing = " + i);
            }
        }
        int[] output = new int[aList.size()];
        for (int i = 0; i < aList.size(); i++) {

            output[i] = aList.get(i);
        }
        for (int a : output) {
            System.out.println(a);
        }
        return output;
    }
}
