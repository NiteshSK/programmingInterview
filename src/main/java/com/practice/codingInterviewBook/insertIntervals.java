package com.practice.codingInterviewBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* this class can be used to insert a particular interval in between an Array of intervals
* */

public class insertIntervals {

    public static void main(String[] args) {
        ArrayList<Interval> arrayList = new ArrayList<Interval>();
        arrayList.add(new Interval(2,4));
        arrayList.add(new Interval(3,6));
        arrayList.add(new Interval(11,14));
        arrayList.add(new Interval(5,8));
        arrayList.add(new Interval(7,9));
        insertInterval(arrayList,new Interval(0,1));

    }


    static ArrayList<Interval> insertInterval(ArrayList<Interval> intervals, Interval intervalToInsert){

        ArrayList<Interval> result = new ArrayList<Interval>();

        for(Interval interval:intervals){
            if(interval.end<intervalToInsert.start){
                result.add(interval);
            }
            else if(interval.start>intervalToInsert.end){
                result.add(intervalToInsert);
                intervalToInsert=interval;
            }
            else if(interval.start<intervalToInsert.end || interval.end>intervalToInsert.start){
                intervalToInsert = new Interval(Math.min(interval.start,intervalToInsert.start),Math.max(interval.end,intervalToInsert.end));
            }

        }
        result.add(intervalToInsert);

        for (int i =0;i<result.size();i++){
            System.out.println(result.get(i).start+","+result.get(i).end);
        }



        return result;
    }


}

class Interval{
    int start;
    int end;

    Interval(){
        start=0;
        end=0;
    }
    Interval(int start,int end){
        this.start = start;
        this.end = end;
    }
}
