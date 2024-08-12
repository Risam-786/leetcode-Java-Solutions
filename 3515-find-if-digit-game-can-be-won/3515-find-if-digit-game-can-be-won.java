class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int bob=0;
        int alice=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10)
            {
               alice=alice+nums[i];
            }
            else
            {
                bob=bob+nums[i];
            }
        }
        if(alice==bob)
        {
            return false;

        }
        else
        {
            return true;
        }
    }
}