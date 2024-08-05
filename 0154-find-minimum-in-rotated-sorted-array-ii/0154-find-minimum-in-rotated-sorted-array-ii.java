class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==nums[h])
            {
                if(nums[l]==nums[h])
                    {
                        l++;
                        h--;
                    }
                else if(nums[l]<nums[h])
                {
                    h--;
                }

                else
                    l++;
            }

            else if(nums[mid]<nums[h])
            {
                h=mid;
            }
            else
               l=mid+1;
        }

        return nums[h];
    }
}