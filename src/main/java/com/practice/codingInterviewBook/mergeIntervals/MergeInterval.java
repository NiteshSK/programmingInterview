package com.practice.codingInterviewBook.mergeIntervals;

import java.util.ArrayList;
import java.util.Collections;

/*
* Merge Intervals
* this programme is used to merge
* @input Given a collection of intervals
* @returns merge all overlapping intervals
* */
public class MergeInterval {

    public static void main(String[] args) {
        ArrayList<Interval> arrayList = new ArrayList<Interval>();
        arrayList.add(new Interval(1,4));
        arrayList.add(new Interval(2,4));
        arrayList.add(new Interval(11,14));
        arrayList.add(new Interval(5,8));
        arrayList.add(new Interval(7,9));
        merge(arrayList);

    }


    public static ArrayList<Interval> merge(ArrayList<Interval> intervals){
        ArrayList<Interval> result = new ArrayList<Interval>();

        Collections.sort(intervals,new IntervalComparator());

        Interval prev = intervals.get(0);
        for(int i = 1;i<intervals.size();i++){
            Interval curr = intervals.get(i);

            if(prev.end>=curr.start){
                Interval merged = new Interval(prev.start,Math.max(prev.start,curr.end));
                prev = merged;
            }
            else {
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);

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
        start = 0;
        end = 0;
    }

    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
