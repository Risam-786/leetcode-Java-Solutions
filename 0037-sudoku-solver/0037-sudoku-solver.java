import java.util.*;
class Solution
{
    public static boolean issafe(char[][] board,int row,int col,char digit)
    {
        int i,j; 
        for(j=0;j<=8;j++)
        {
            if(board[row][j]==digit)
            {
                return false;
            }
        }
        for(i=0;i<=8;i++)
        {
            if(board[i][col]==digit)
            {
                return false;
            }
        } 
        int x,y; 
        x=row/3*3; 
        y=col/3*3; 
        for(i=x ; i<=x+2; i++)
        {
            for(j=y ; j<=y+2 ; j++)
            {
               if(board[i][j]==digit)
               {
                   return false;
               }
            }
        } 
        return true;
    }
    public static boolean solve(char[][] board,int row,int col)
    {
        if(row==8 && col == 9)
        {
            return true;
        }
        else
        {
            if(col==9)
            {
                row++; 
                col=0;
            }
            if(board[row][col]=='.')
            {
                for(char digit='1';digit<='9';digit++)
                {
                    if(issafe(board,row,col,digit)==true)
                    {
                        board[row][col] = digit; 
                        if(solve(board,row,col+1)) 
                        {
                            return true;
                        }
                        board[row][col] ='.';
                    }
                }
                return false;
            }
            else 
            {
                return solve(board,row,col+1);
            }
        }
    }
    public static void solveSudoku(char[][] board)
    {
        solve(board,0,0); 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        char[][] board = new char[9][9]; 
        int i,j; 
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                board[i][j] = sc.next().charAt(0);
            }
        } 
        solveSudoku(board); 
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}