package com.practice.interviewBit.Array;

public class Add1 {
    public static void main(String[] args) {
        // Sample input
        // Try to test with {0,1,2,3,4}, {0,0,0,0,0,0,1}
        int []A = { 9, 9, 9, 9, 9 };
        plusOne1(A);
    }
    //Our goal is to add the one to the number which will get generated after parsing an array.
    static int[] plusOne1(int[] digits) {
        int borrow = 1;
        int[] result = new int[digits.length];

        // Parsing the array and simple adding the one into it and
        // using mod 10 for generating the number
        // checking the number is divisible to 10 or not using borrow.
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + borrow;
                result[i] = val % 10;
                borrow = val / 10;
        }

        // after adding one into the digit generated by it we have to initialize the array with the digits + 1.
        if (borrow == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }

        return removeZeros(result,result.length);
    }

    /**
     * This is the method we have created as for the case like the input = {0,1,2,3}
     * for that we have to remove the leading zeros from it.
     * @param arr
     * @param len
     * @return
     */
    static int[] removeZeros(int[] arr, int len)
    {
        int index = -1;
        // Parse the array and check the first number greater than 0 and keep the index.
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                index = i;
                break;
            }
        }

        // Initialize the array with length - index so that leading zeros can be eleminated.
        int[] nonZero = new int[len - index];
        for (int i = 0; i < len - index; i++)
            nonZero[i] = arr[index + i];

        return nonZero;
    }
}
