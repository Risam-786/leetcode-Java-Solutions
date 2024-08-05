
class Solution {
    public static void solve(int[] candidates, int target, int start, List<List<Integer>> result, List<Integer> list, Set<List<Integer>> seen) {
        if (target == 0) {
            if (!seen.contains(new ArrayList<>(list))) {
                result.add(new ArrayList<>(list));
                seen.add(new ArrayList<>(list));
            }
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            list.add(candidates[i]);
            solve(candidates, target - candidates[i], i + 1, result, list, seen);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        Arrays.sort(candidates); // sort to handle duplicates
        solve(candidates, target, 0, result, list, seen);
        return result;
    }
}