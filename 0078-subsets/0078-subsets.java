class Solution {
public static void solve(int[] nums,List<List<Integer>> result,List<Integer> list,int i){
if(i==nums.length)
{
result.add(new ArrayList<>(list));
return;
}
else{
list.add(nums[i]);
solve(nums,result,list,i+1);
list.remove(list.size()-1);
solve(nums,result,list,i+1);
}
}
 public List<List<Integer>> subsets(int[] nums) {
List<List<Integer>> result=new ArrayList<>();
List<Integer> list=new ArrayList<>();
solve(nums,result,list,0);
return result;
}
}
