package com.foundation;

import java.util.Arrays;

public class PrefixSum {
    public static void prefixSumWithoutVar(int[] inputArr){
        int sum = 0;
        int[] result = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i];
            result[i] = sum;
        }

        System.out.println("======= Prefix Sum with Sum var ======");
        System.out.println("Input: " + Arrays.toString(inputArr));
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static void prefixSumWithVar(int[] inputArr){
        int[] result = new int[inputArr.length];
        result[0] = inputArr[0];
        for (int i = 1; i < inputArr.length; i++)
            result[i] = result[i - 1] + inputArr[i];

        System.out.println("======= Prefix Sum without Sum var ======");
        System.out.println("Input: " + Arrays.toString(inputArr));
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        prefixSumWithoutVar(new int[]{1, 2, 3});
        prefixSumWithVar(new int[]{1, 2, 3, 6, 8});
    }
}
