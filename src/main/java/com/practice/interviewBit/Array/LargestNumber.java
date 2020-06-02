package com.practice.interviewBit.Array;

import java.util.ArrayList;

public class LargestNumber {

    public void formLargestNumber(int[] arrayList){
        int[] outputList = {};
        Integer first = arrayList[0];
        Integer temp = 0;
        for(int i = 1; i < arrayList.length-1; i++ ){
            if(arrayList[i] > 10 && arrayList[i] % 10 < first){
                outputList[i+1] = temp;
                temp = outputList[i];
                outputList[i] = outputList[i+1];

            }
        }
//        for(int i = 0; i < arrayList.length; i++){
//          int key = arrayList[i];
//            int j = i-1;
//            while(j >= 0 && arrayList[j] > key){
//                arrayList[j+1] = arrayList[j];
//                j = j-1;
//            }
//            arrayList[j+1] = key;
//        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(30);
        arrayList.add(34);
        arrayList.add(5);
        arrayList.add(9);
        int arr[] = {3,30,34,5,9};
        largestNumber.formLargestNumber(arr);
        printArray(arr);
    }
}
