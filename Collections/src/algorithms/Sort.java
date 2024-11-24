package algorithms;

import java.util.Arrays;

public class Sort {

    public static String sortArray(int[] nums) {

        for (int i = nums.length; i > 0; i--) {

            for (int j = 0; j < i - 1; j++) {

                int replace = nums[j];

                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = replace;
                }
            }

        }
        return Arrays.toString(nums);
    }
}
