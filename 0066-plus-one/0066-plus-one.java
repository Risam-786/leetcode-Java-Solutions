class Solution {
    public int[] plusOne(int[] digits) {
        int b[] = new int[digits.length+1];

        if(digits[digits.length-1]<9){
            digits[digits.length-1] ++;
            return digits;
        } else{
            int i=digits.length-1;
            while(i>=0){
                if (i==0 && digits[i]==9){
                  digits = new int[digits.length + 1];
                  digits[0] = 1;
                  return digits;
                }
                if (digits[i]==9){
                    digits[i]=0;
                    i--;
                }else{
                     digits[i]++;
                     return digits;
                }
            }
        } 
        return digits;
    }
}