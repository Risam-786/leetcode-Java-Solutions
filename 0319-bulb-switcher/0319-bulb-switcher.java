class Solution {
    public int bulbSwitch(int n) 
    {
        if(n==0){
            return 0;
        }
       if(n==1){
        return 1;
       }
       int res = (int)Math.sqrt(n);
       return res;
    }
}