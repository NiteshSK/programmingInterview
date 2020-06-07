package com.practice.codingInterviewBook.Array;

//n =7 and k=3
//array = [1,2,3,4,5,6,7] target=[5,6,7,1,2,3,4]
public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotateTimeEfficient(array,3);
        rotateArraySpaceEfficient(array,3);
        rotateArrayBestApproach(array,3);
    }


    static void rotateTimeEfficient(int[] array, int rotateBy){
        if(rotateBy>array.length)
            rotateBy = rotateBy%array.length;

        if(array.length == 0 || array == null)
        {
            System.out.println("empty array");
        }

        int[] tempArray = new int[array.length];

        for(int i = 0;i<rotateBy;i++){
            tempArray[i] = array[array.length-rotateBy+i];
        }
        int j = 0;
        for(int i = rotateBy;i<array.length;i++){
            tempArray[i] = array[j];
            j++;
        }

        for(int i : tempArray){
            System.out.print(i);
        }

    }

    private static void rotateArraySpaceEfficient(int array[],int rotateBy){

        for(int i = 0;i<rotateBy;i++){
            for(int j = array.length-1;j>0;j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }

        for(int i : array){
            System.out.println(i);
        }

    }

    private static void rotateArrayBestApproach(int[] array,int rotateBy){
        reverse(array,0,array.length-rotateBy-1);
        reverse(array,array.length-rotateBy,array.length-1);
        reverse(array,0,array.length-1);
        for(int a: array){
            System.out.print(a);
        }
    }

    static void reverse(int[] array,int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
