class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] LIS = new int[n];

        // Initialize LIS values for all indexes
        for (int i = 0; i < n; i++) {
            LIS[i] = 1;
        }

        // Compute optimized LIS values in bottom-up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && LIS[i] < LIS[j] + 1) {
                    LIS[i] = LIS[j] + 1;
                }
            }
        }

        // Find the maximum value in LIS[]
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < LIS[i]) {
                max = LIS[i];
            }
        }

        return max;
    }
}
