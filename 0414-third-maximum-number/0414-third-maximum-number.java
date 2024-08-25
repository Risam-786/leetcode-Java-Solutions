class Solution {
    public int thirdMax(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        HashSet <Integer> set = new HashSet<>();
        for(int st : nums)
        set.add(st);
        List<Integer> list = new ArrayList<>();
        for(int res:set)
        list.add(res);
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()<3){
            return list.get(0);
        }
        else{
            return list.get(2);
        }
      
        
    }
}