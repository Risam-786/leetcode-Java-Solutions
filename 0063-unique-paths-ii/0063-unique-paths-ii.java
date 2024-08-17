class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][]dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else if(i==1 && j==1)
                {
                    if(obstacleGrid[i-1][j-1]==1)
                    {
                        return 0;
                    }
                    else
                    {
                        dp[i][j]=1;
                    }
                }
                else
                {
                    if(obstacleGrid[i-1][j-1]==1)
                    {
                        dp[i][j]=0;
                    }
                    else
                    {
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
        }
        return dp[n][m];
    }
}