class Solution {
    public static void solve(int[] candidates, int target, int i, List<List<Integer>> result, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || i >= candidates.length) {
            return;
        }
        // Include the current candidate
        list.add(candidates[i]);
        solve(candidates, target - candidates[i], i, result, list);
        list.remove(list.size() - 1);
        // Exclude the current candidate and move to the next
        solve(candidates, target, i + 1, result, list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(candidates, target, 0, result, list);
        return result;
    }
}