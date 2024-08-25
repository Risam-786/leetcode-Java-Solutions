class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        Set<Character> s = new HashSet<>();
        int count = 0;
        char ch[] = jewels.toCharArray();
        for(char i : ch)
        {
            s.add(i);
        }
        char ch1[] = stones.toCharArray();
        int n = ch1.length;
        for(int i=0;i<n;i++)
        {
            if(s.contains(ch1[i]))
            {
                count++;
            }
        }
        return count;
    }
}