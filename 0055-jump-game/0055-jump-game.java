class Solution {
    public boolean canJump(int[] nums) {
       int max=0,n=nums.length;
for(int i=0;i<n;i++){
if(i>max)
return false;
max=Math.max(max,nums[i]+i);
}
return true;
 
    }
}