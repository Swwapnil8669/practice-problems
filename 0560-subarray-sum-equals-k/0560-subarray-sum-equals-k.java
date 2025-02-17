class Solution {
    public int subarraySum(int[] nums, int k) {
         int count = 0;

        // Start from each index and calculate sum of subarray
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                // Check if the current sum equals k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}