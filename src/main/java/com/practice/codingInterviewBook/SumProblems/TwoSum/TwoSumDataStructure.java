package com.practice.codingInterviewBook.SumProblems.TwoSum;

import java.util.HashMap;

/*
* In this class, we are creating two methods
* i). to add the value in the existing data structure
* ii). find method which returns boolean value if sum of two elements
* is equals to the target value
* */

public class TwoSumDataStructure {

    /*
    * Since the desired class needs add and get option so, hashmap will be good option
    * */
    HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();

    /*
    *@param: passing Number which we want to insert in our datastructure
    * returns void
    * */
    private void add(int number){
        if(hashMap.containsKey(number)){
            hashMap.put(number,hashMap.get(number)+1);
        }else{
            hashMap.put(number,1);
        }
    }

    /*
    * @param passinf the number which we want to check for sum of two elements
    * return boolean
    * */
    private boolean find(int value){
        for(Integer i : hashMap.keySet()){
            int target = value - i;
            if(hashMap.containsKey(target)){
                if(i==target || hashMap.get(i) < 2 ){
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}
