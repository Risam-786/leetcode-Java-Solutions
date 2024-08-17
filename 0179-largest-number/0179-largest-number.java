class Solution {
    public String largestNumber(int[] nums)
    {   int n = nums.length;
        String str[] = new String[n];
        for(int i=0;i<n;i++)
        {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            str1.append(str[i]);
        }
        return str1.charAt(0)=='0'?"0":str1.toString();
    }
}