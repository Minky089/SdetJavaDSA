package array;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;

@Log4j2
public class ShuffleArray {
    /**
     * Time Complexity: We visit each element once.
     * Space Complexity: To store the result array.
     */
    public static int[] shuffleWithExtraArray(int[] nums, int n) {
        log.info("Extra Array - Input: {}", Arrays.toString(nums));
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            // Place x_i at even indices: 0, 2, 4...
            result[2 * i] = nums[i];
            // Place y_i at odd indices: 1, 3, 5...
            result[2 * i + 1] = nums[n + i];
        }
        log.info("Extra Array - Output: {}", Arrays.toString(result));
        return result;
    }

    public static int[] shuffleWithBitwise(int[] nums, int n) {
        log.info("Bitwise - Input: {}", Arrays.toString(nums));
        // Encoding: Use 1024 (2^10) to store y_i in the upper 10 bits of x_i
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] | (nums[n + i] << 10);
        }

        // Decoding: Iterate backwards to avoid overwriting values we still need
        for (int i = n - 1; i >= 0; i--) {
            int y = nums[i] >> 10;
            int x = nums[i] & 1023; // 1023 is 2^10 - 1
            nums[2 * i + 1] = y;
            nums[2 * i] = x;
        }
        log.info("Bitwise - Output: {}", Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        shuffleWithBitwise(new int[]{1,2,3,4,5,6}, 3);
        shuffleWithExtraArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
    }
}