class Solution {
    public int findMin(int[] nums) {
        int l = nums.length-1, s=0, pos=-1;
        while(l>s) {
            int mid = s + (l-s)/2;
            if(nums[mid] > nums[l]) {
                s = mid+1;
            } else {
                l = mid;
            }
        }
        return nums[s];
    }
}