package com.practice.codingInterviewBook.Array;

import java.util.ArrayList;

//n =7 and k=3
//array = [1,2,3,4,5,6,7] target=[5,6,7,1,2,3,4]
public class RotateArrayList {

    //n =7 and k=3
    //array = [1,2,3,4,5,6,7] target=[5,6,7,1,2,3,4]
        /*
         * Space Complexity will be more in this approach
         * As We are using two arraylist
         * Time complexity will be O(n)
         * */
        public ArrayList<Integer> rotateArrayList(ArrayList < Integer > array, Integer length, Integer rotationPoint){
            ArrayList<Integer> targetArray = new ArrayList<Integer>();
            for (int i = length - rotationPoint; i < length; i++) {
                targetArray.add(array.get(i));
                if (i >= length - 1) {
                    for (int j = 0; j < length - rotationPoint; j++) {
                        targetArray.add(array.get(j));
                    }
                }
            }
            for (Integer a : targetArray) {
                System.out.print(a);
            }
            return targetArray;
        }

        public static void main (String[]args){
            RotateArrayList rotateArrayList = new RotateArrayList();
            ArrayList<Integer> array = new ArrayList<Integer>();
            array.add(1);
            array.add(2);
            array.add(3);
            array.add(4);
            array.add(5);
            array.add(6);
            array.add(7);
            Integer length = array.size();
            Integer rotationPoint = 3;
            rotateArrayList.rotateArrayList(array, length, rotationPoint);
        }
    }


