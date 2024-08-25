class Solution {
    public int addDigits(int num) 
    {
       int val = num;
       while(val>9)
       {
        int sum = 0;
        while(val!=0)
        {
            int rem = val%10;
            sum = sum + rem ;
            val = val/10;
        }
        val = sum;
       } 
       return val;
    }
}