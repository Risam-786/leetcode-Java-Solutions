class Solution {
        int count=0;
    public boolean issafe(int row,int col,char[][] board,int n){
int i,j;
for(j=col-1;j>=0;j--){
if(board[row][j]=='Q')
return false;
}
for(i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
if(board[i][j]=='Q')
return false;
}
for(i=row+1,j=col-1;i<=n-1&&j>=0;i++,j--){
if(board[i][j]=='Q')
return false;
}
return true;
}
public void solve(char[][] board,int col,int n){
if(col==n){


count=count+1;
return;
}
else{
for(int row=0;row<=n-1;row++){
if(issafe(row,col,board,n)==true){
board[row][col]='Q';
solve(board,col+1,n);
board[row][col]='.';
}
}
}
}
 public int totalNQueens(int n) {
char[][] board=new char[n][n];
int i,j;
for(i=0;i<=n-1;i++){
for(j=0;j<=n-1;j++){
board[i][j]='.';
}
}
solve(board,0,n);
return count;
} 
}