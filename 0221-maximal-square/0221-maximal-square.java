class Solution
{
    public int min(int a,int b,int c)
    {
        if(a<=b&&a<=c)
        {
            return a;
        }
        else if(b<=a && b<=c)
        {
            return b;
        }
        else 
        {
            return c;
        }
    }
    public int maximalSquare(char[][] matrix)
    {
        int n,m; 
        n = matrix.length; 
        m = matrix[0].length;  
        int[][] solution = new int[n][m]; 
        int i,j;  
        //(0,0)  => '1'-48 => 49-48 => 1 
        for(i=0 ; i<=n-1 ;i++)
        {
            for(j=0 ; j<=m-1 ;j++)
            {
                if(i==0 || j==0)
                {
                    solution[i][j] = matrix[i][j]-48;
                }
                else 
                {
                    if(matrix[i][j]=='0')
                    {
                        solution[i][j] = 0;
                    }
                    else 
                    {
                        solution[i][j] =  min(solution[i-1][j],solution[i-1][j-1],
                                             solution[i][j-1])+1;
                    }
                }
            }
        } 
        int max = 0; 
        for(i=0 ; i<=n-1 ; i++)
        {
            for(j=0 ;j<=m-1 ;j++)
            {
                if(max < solution[i][j])
                {
                    max = solution[i][j];
                }
            }
        } 
        return max*max;

    }
}