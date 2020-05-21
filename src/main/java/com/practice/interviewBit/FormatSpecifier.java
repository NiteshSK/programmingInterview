package com.practice.interviewBit;

public enum FormatSpecifier {
    PARQUET{
        public void hello(){
            System.out.println("spark.read.parquet");
        }
    },
    AVRO{
        public void hello(){
            System.out.println("spark.read.avro");
        }
    },
    CSV{
        public void hello(){
            System.out.println("spark");
        }
    };
    public abstract void hello();
}
//
//    static int[] plusOne(int[] A) {
//        int length = A.length;
//        Long base = 1L;
//        Long number = 0L;
//        int len = 0;
//        Long finalNumber = 0L;
//        for (int i = length -1; i >= 0; i--){
//
//            number = (base * A[i] + number);
//            System.out.println(number+" "+base);
//            base = base * 10;
//        }
//
//        len = Long.toString(number+1).length();
//        finalNumber = number+1;
//        int [] outArr = new int[len];
//        for(int i =len-1 ; i>=0; i--){
//            outArr[i] = (int)(finalNumber%10);
//            finalNumber = finalNumber/10;
//        }
//        for (int a : outArr){
//            System.out.println(a);
//        }
//        return outArr;
//    }