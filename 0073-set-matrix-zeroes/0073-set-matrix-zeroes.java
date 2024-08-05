class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
       int n,m; 
       n = matrix.length; 
       m = matrix[0].length;  
       int[] row = new int[n]; 
       int[] col = new int[m];
       int i,j; 
       for(i=0 ; i<=n-1 ; i++)
       {
        for(j=0 ; j<=m-1 ; j++)
        {
            if(matrix[i][j]==0)
            {
                if(matrix[i][j]==0)
                {
                    row[i] = 1; 
                    col[j] = 1;
                }
            }
        }
       }  
       for(i=0;i<=n-1;i++) 
       {
        for(j=0;j<=m-1;j++)
        {
           if(row[i]==1 || col[j]==1)
           {
             matrix[i][j]  = 0;
           }
        }
       }
    }
}