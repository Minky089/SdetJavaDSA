package array;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SwapTwoNumber {
    private static void firstSolution(int a, int b) {
        log.info("Temp var swapping - Input: a = {}, b = {}", a, b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        log.info("Temp var swapping - Output: a = {}, b = {}", a, b);
    }    /* S2: Using mathematical operation        Subtraction is the inverse of Addition.        If we take sum of 2 number then subtract one of them,        it always returns the other one.        */

    private static void secondSolution(int a, int b) {
        log.info("Mathematical swapping - Input: a = {}, b = {}", a, b);

        a = a + b;
        b = a - b;
        a = a - b;
        log.info("Mathematical swapping - Output: a = {}, b = {}", a, b);
    }    /* S3: Using bitwise operation        XOR is its own inverse.        If we take XOR of 2 number then XOR one of them,        it always returns the other one.        */

    private static void thirdSolution(int a, int b) {
        log.info("Bitwise swapping - Input: a = {}, b = {}", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        log.info("Bitwise swapping - Output: a = {}, b = {}", a, b);
    }

    private static void arraySolution(int a, int b) {
        log.info("Array swapping - Input: a = {}, b = {}", a, b);
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        a = arr[1];
        b = arr[0];
        log.info("Array swapping - Output: a = {}, b = {}", a, b);
    }

    public static void main(String[] args) {
        firstSolution(10, 20);
        secondSolution(15, 25);
        thirdSolution(-35, -995);
        arraySolution(-10099, 209);
    }
}