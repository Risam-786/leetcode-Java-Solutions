class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int n = nums.length;
        int res=0;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                res=res^nums[i];
                break;

                }
                
            }
        }
        return res;
    }
}