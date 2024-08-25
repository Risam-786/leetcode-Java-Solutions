class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length, -1);
    }
    private int search(int[] nums, int target, int start, int end, int closestIndex) {
        if(start >= end) {
            if(target <= nums[closestIndex]) return closestIndex;
            return closestIndex + 1;
        }
        int mid = end / 2 + start / 2;
        int value = nums[mid];

        if(closestIndex == -1) closestIndex = mid;
        else if(Math.abs(value - target) < Math.abs(nums[closestIndex] - target)) closestIndex = mid;
        

        if(value == target) return mid;
        if(target > value) return search(nums, target, mid + 1, end, closestIndex);
        return search(nums, target, start, mid, closestIndex);
    }
}