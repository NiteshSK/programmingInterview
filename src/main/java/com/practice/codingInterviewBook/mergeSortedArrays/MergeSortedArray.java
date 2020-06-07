package com.practice.codingInterviewBook.mergeSortedArrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;

        int[] array2 = {2,4,6,8};

        merge(array1,array2);
    }

    static int[] merge(int[] array1,int[] array2){
        int array1Size = 4;
        int array2Size = 4;

        while (array1Size>0 && array2Size>0){
            if(array1[array1Size-1]>array2[array2Size-1]){
                array1[array1Size+array2Size-1] = array1[array1Size-1];
                array1Size--;
            }
            else {
                array1[array1Size+array2Size-1] = array2[array2Size-1];
                array2Size--;
            }
        }

        while(array2Size > 0){
            array1[array1Size+array2Size-1] = array2[array2Size-1];
            array2Size--;
        }

        for (int i =0;i<array1.length;i++){
            System.out.print(array1[i]);
        }

        return null;
    }
}
