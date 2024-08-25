class Solution
{
    public int solve(int i,int j,int dp[][]) //i=2 j=2 
    {
        if(i==-1 || j==-1)
        {
            return 0;
        } 
        if(i==0&&j==0)
        {
            return 1;
        }
        if(dp[i+1][j+1]!=-1)
        {
            return  dp[i+1][j+1];
        }
        else
        {
        dp[i+1][j+1]=solve(i,j-1,dp)+solve(i-1,j,dp); 
        } 
        return dp[i+1][j+1];
    }
    public int uniquePaths(int n, int m)
    {
          int[][] dp = new int[n+1][m+1]; 
         int i,j; 
         for(i=0;i<=n;i++)
         {
             for(j=0;j<=m;j++)
             {
                 dp[i][j] = -1;
             }
         }
        return solve(n-1,m-1,dp);
    }
}