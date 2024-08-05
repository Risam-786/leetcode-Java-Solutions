class Solution {
        public void solve(int []nums,List<List<Integer>> result,int start,int end,Set<List<Integer>> seen){
        if(start==end){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
             if (!seen.contains(list)) {
                result.add(list);
                seen.add(list);
            }
            return;
        }
        else{
            for(int i =start;i<=end;i++){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                solve(nums,result,start+1,end,seen);
                temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        solve(nums,result,0,nums.length-1,seen);
        return result;
        
    }
}