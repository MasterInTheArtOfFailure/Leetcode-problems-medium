class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closestSum to the sum of the first three elements
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Initialize left pointer
            int right = nums.length - 1; // Initialize right pointer
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the sum of three elements
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update closestSum if the current sum is closer to the target
                }
                if (sum < target) {
                    left++; // Move left pointer to the right
                } else if (sum > target) {
                    right--; // Move right pointer to the left
                } else {
                    return sum; // Return the sum if it equals to the target
                }
            }
        }
        return closestSum; // Return the closest sum
    }
}