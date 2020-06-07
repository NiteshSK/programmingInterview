package com.practice.codingInterviewBook.deleteDuplicateInSortedArray;

/*
* In tis programme, we are calculatinfg length of array after removing
* duplicate values from sorted array
* */
public class DeleteDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,5,5,5,5,7,8,9};
        int[] array1 = {1,1,2,2,3,4,5,5,5,5,7,8,9};
        /*
        * uncomment these methods one by one to verify
        * */
//        deleteDuplicates(array);
//        uniqueCount(array1);
    }

    private static int deleteDuplicates(int[] array) {
        int j = 0;
        int i = 1;
        while (i < array.length){
            if(array[i] == array[j]){
                i++;
            }
            else{
                j++;
                array[j] = array[i];
                i++;

            }
        }
        return j+1;

    }

    private static int uniqueCount(int[] array){
        int count = 0;
        for(int i = 0;i< array.length-1;i++){
            if(array[i] == array[i+1]){
                count++;
            }
        }
        return array.length-count;

    }

}
