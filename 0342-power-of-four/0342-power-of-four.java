class Solution {
    public boolean isPowerOfFour(int n) 
    {
       if (n == 1) return true;
        while(0 < n){
            if (n % 4 != 0){
                return false;
            }
            n = n/4;
            if (n == 1){
                return true;
            }
        }
        return false;

    }
}
