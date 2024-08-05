class Solution {
public static void solve(int[] nums, List<List<Integer>> result, List<Integer> list, int i, Set<List<Integer>> set) {
        if (i == nums.length) {
            if (!set.contains(list)) {
                result.add(new ArrayList<>(list));
                set.add(new ArrayList<>(list));
            }
            return;
        } else {
            list.add(nums[i]);
            solve(nums, result, list, i + 1, set);
            list.remove(list.size() - 1);
            solve(nums, result, list, i + 1, set);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>(); // Use a set to track unique subsets
        solve(nums, result, list, 0, set);
        return result;
    }

}