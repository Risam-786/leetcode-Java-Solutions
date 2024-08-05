class Solution {
    public void solve(int []nums,List<List<Integer>> res,int start,int end){
        if(start==end){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            res.add(list);
            return;
        }
        else{
            for(int i =start;i<=end;i++){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                solve(nums,res,start+1,end);
                temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums,res,0,nums.length-1);
        return res;
    }
}