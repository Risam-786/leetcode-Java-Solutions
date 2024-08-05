class Solution {
    public static void solve(List<Integer> list,List<List<Integer>> result,int start,int n,int k){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i= start;i<=n;i++){
                list.add(i);
                solve(list,result,i+1,n,k);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        solve(list,result,1,n,k);
        return result;
        
    }
}