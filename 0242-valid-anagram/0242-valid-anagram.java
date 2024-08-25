class Solution {
    public boolean isAnagram(String s, String t) 
    {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length()!=t.length())
        {
            return false;
        }
        int freqs[] = new int[256];
        int freqt[] = new int [256];
        for(int i=0;i<s.length();i++){
            freqs[s.charAt(i)]++;
            freqt[t.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freqs[i]!=freqt[i]){
                return false;
            }
        }
        return true;
    }
}