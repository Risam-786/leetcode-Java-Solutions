class Solution {
    public int compress(char[] chars) {
        int index = 0; 
        int i = 0; 
        int n =chars.length;
        
        while (i < n) {
            char c = chars[i];
            int len = 0;
            
            
            while (i < n && chars[i] == c) {
                i++;
                len++;
            }
            
          
            chars[index++] = c;
            
           
            if (len > 1) {
                for (char dig : Integer.toString(len).toCharArray()) {
                    chars[index++] = dig;
                }
            }
        }
        
        
        return index;
    }
}