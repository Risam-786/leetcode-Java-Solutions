class Solution {
       public List<Integer> spiralOrder(int[][] mat)
    {
        int n,m,i; 
        n = mat.length; 
        m = mat[0].length;
        List<Integer> list = new ArrayList<>(); 
        int left=0,right=m-1 , top=0,bottom = n-1; 
        while(left<=right && top<=bottom)
        {
             for(i=left ; i<=right ; i++)
{
     list.add(mat[top][i]);
}
top++;
for(i=top;i<=bottom;i++)
{
   list.add(mat[i][right]);
}
right--; 
if(top<=bottom)
for(i=right;i>=left;i--)
{
  list.add(mat[bottom][i]);
}
bottom--;  
if(left<=right)
for(i=bottom ; i>=top ; i--)
{
  list.add(mat[i][left]);
}
left++;

 } 
 return list;
    }

}