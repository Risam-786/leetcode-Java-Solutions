class Solution {
    public String mergeAlternately(String word1, String word2)
    {
        int n = word1.length();
        int m = word2.length();
        int max = Math.max(n,m);
        StringBuilder res = new StringBuilder();
        int i = 0;
        for(i=0;i<max;i++)
        {
            if(i<n){
                res.append(word1.charAt(i));
            }
            if(i<m){
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}