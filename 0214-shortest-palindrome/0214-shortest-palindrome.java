class Solution {
    public String shortestPalindrome(String s) 
    {
        int j = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == s.charAt(j)) { j += 1; }
    }
    if (j == s.length()) { return s; }
    String first = s.substring(j);
    return new StringBuffer(first).reverse().toString() + shortestPalindrome(s.substring(0, j)) + first;

    }
}