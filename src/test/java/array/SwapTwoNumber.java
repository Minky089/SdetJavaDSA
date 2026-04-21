package array;

public class SwapTwoNumber {
    void firstSolution(int a, int b) {
        System.out.println("Swapping with temp var...");
        System.out.println("Two numbers before swapping: a = " + a + ", b = " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Two numbers after swapping: a = " + a + ", b = " + b);
    }    /* S2: Using mathematical operation        Subtraction is the inverse of Addition.        If we take sum of 2 number then subtract one of them,        it always returns the other one.        */

    void secondSolution(int a, int b) {
        System.out.println("Swapping with mathematical operation...");
        System.out.println("Two numbers before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Two numbers after swapping: a = " + a + ", b = " + b);
    }    /* S3: Using bitwise operation        XOR is its own inverse.        If we take XOR of 2 number then XOR one of them,        it always returns the other one.        */

    void thirdSolution(int a, int b) {
        System.out.println("Swapping with bitwise operation...");
        System.out.println("Two numbers before swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Two numbers after swapping: a = " + a + ", b = " + b);
    }

    void arraySolution(int a, int b) {
        System.out.println("Swapping with array...");
        System.out.println("Two numbers before swapping: a = " + a + ", b = " + b);
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        a = arr[1];
        b = arr[0];
        System.out.println("Two numbers after swapping: a = " + a + ", b = " + b);
    }

    void main() {
        firstSolution(10, 20);
        secondSolution(15, 25);
        thirdSolution(-35, -995);
        arraySolution(-10099, 209);
    }
}