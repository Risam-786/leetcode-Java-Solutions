class Solution {
    public int maxFrequencyElements(int[] nums)
     {   int n=nums.length;
          int count=0 ;

        int [] arr = new int[101];
        for(int i =0 ;i<n;i++)
        {
            arr[nums[i]]++;
        }
        int sum=0;
        for(int i =0;i<arr.length;i++)
        {
            sum=Math.max(sum,arr[i]);
        }
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==sum)
            {
                count+=sum;
            }
        }
        return count;
    }
}