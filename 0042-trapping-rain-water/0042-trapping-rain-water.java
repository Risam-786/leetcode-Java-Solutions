class Solution {
    public int trap(int[] height) 
    {
        int n = height.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
       prefix[0] = height[0];
       for(int i=1;i<=n-1;i++)
       {
        if(prefix[i-1]<height[i])
        prefix[i] = height[i];
        else
        prefix[i]=prefix[i-1];
       }
         suffix[n-1] = height[n-1]; 
        for(int i= n-2 ; i>=0 ; i--)
        {
            if(suffix[i+1] < height[i])
            {
                suffix[i] = height[i];
            }
            else 
            {
                suffix[i] = suffix[i+1];
            }
        }
        int water = 0;
        for(int i=0;i<=n-1;i++)
        {
            int min = (prefix[i]<=suffix[i])?prefix[i]:suffix[i];
            water =water + (min-height[i]);
        }
        return water;
    }
}