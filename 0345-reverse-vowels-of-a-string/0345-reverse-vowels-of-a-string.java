class Solution {
    public static boolean isvowels(char i){
        if(i=='a' || i=='e' || i=='i' || i == 'o' || i =='u' || i=='A' || i == 'E' || i == 'I' || i == 'O' || i == 'U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) 
    {
        int n = s.length()-1;
        char [] c = s.toCharArray();
        int i =0;
        int j = n;
        while(i<=j)
        {
            char a = c[i];
            char b = c[j];

        
        if(isvowels(a)&&isvowels(b))
        {
            c[i] = b;
            c[j] = a;
            i++;
            j--;
        }
        else if(isvowels(a)){
            j--;
        }
        else{i++;}
        }
        return new String(c);
    }
}