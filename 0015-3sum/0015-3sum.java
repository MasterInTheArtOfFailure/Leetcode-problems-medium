class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array to make it easier to find triplets
        List<List<Integer>> result = new ArrayList<>(); // List to store the result
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue; // Skip duplicates
            
            int j = i + 1;
            int k = n - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    
                    while (j < k && nums[j] == nums[j-1]) j++; // Skip duplicates
                    while (j < k && nums[k] == nums[k+1]) k--; // Skip duplicates
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return result;
    }
}