class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length,count=0;
        int exp[]=new int[n];
       for(int i=0;i<n;i++){
        exp[i]=heights[i];
       }
       Arrays.sort(exp);
       for(int i=0;i<n;i++){
        if(exp[i]!=heights[i])
        count++;
       }
       return count;
    }
}