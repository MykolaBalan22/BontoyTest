package solution;

import java.util.List ;

public class Task {

    public int removeDuplicates(int[] nums) {

        int uniqueValue = 1;

        int lenght = nums.length;

        for (int i = 1; i < lenght; i++) {

            if (nums[i] == nums[i - 1]) {

                int temp = nums[i];
                for (int j = i; j < lenght - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[lenght - 1] = temp;

                lenght--;
                i--;

            } else {
                uniqueValue++;
            }
        }
        return uniqueValue;
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {

            innerCycle : for (int j = 0; j < nums2.length; j++) {

                if(nums1[i]==nums2[j]) {

                    for (int k = 0; k < counter; k++) {
                        if(result[k]==nums1[i]) {
                            continue innerCycle;
                        }
                    }
                    result[counter] = nums1[i];
                    counter++;
                    break;
                }

            }
        }
        int [] array  = new int[counter];

        for (int i = 0; i < array.length; i++) {
            array[i]=result[i];
        }
        return array;
    }

    public int numberOfPoints(List<List<Integer>> nums) {
        return 7;



    }





}
