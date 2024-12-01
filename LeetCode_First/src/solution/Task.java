package solution;

public class Task {

    public int removeDuplicates(int[] nums) {

        int uniqueValue = 1;

        int lenght = nums.length;

        for (int i = 1; i < lenght; i++) {

            if (nums[i] == nums[i - 1]) {

                int temp = nums[i];
                for (int j = i; j < lenght-1; j++) {
                    nums[j] =  nums[j + 1];
                }
                nums[lenght-1]=temp;

                lenght--;
                i--;

            }else {
                uniqueValue++;
            }
        }
        return uniqueValue;
    }





}
