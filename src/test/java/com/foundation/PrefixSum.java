package com.foundation;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;

@Log4j2
public class PrefixSum {
    public static void prefixSumWithTempVar(int[] inputArr){
        int sum = 0;
        int[] result = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i];
            result[i] = sum;
        }

        log.info("Temp Var Prefix Sum - Input: {}", Arrays.toString(inputArr));
        log.info("Temp Var Prefix Sum - Output: {}", Arrays.toString(result));
    }

    public static void prefixSumWithArray(int[] inputArr){
        int[] result = new int[inputArr.length];
        result[0] = inputArr[0];
        for (int i = 1; i < inputArr.length; i++)
            result[i] = result[i - 1] + inputArr[i];

        log.info("Array Prefix Sum - Input: {}", Arrays.toString(inputArr));
        log.info("Array Prefix Sum - Output: {}", Arrays.toString(result));
    }

    public static void main(String[] args) {
        prefixSumWithTempVar(new int[]{1, 2, 3});
        prefixSumWithArray(new int[]{1, 2, 3, 6, 8});
    }
}
