import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int stopIndex = -1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                stopIndex = i;
                break;
            }
        }
        if (stopIndex == -1) {
            Arrays.sort(nums);
        } else {
            int firstBiggerIndex = -1;
            for (int i = nums.length - 1; i > stopIndex; i--) {
                if (nums[i] > nums[stopIndex]) {
                    firstBiggerIndex = i;
                    break;
                }
            }

            int temp = nums[firstBiggerIndex];
            nums[firstBiggerIndex] = nums[stopIndex];
            nums[stopIndex] = temp;

            reverseRightPart(nums, stopIndex + 1);
        }


    }

    void reverseRightPart(int[] nums,int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
