class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> S = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int Z = target - nums[i];
            if (S.containsKey(Z)) {
                int[] a = { S.get(Z), i };
                return a;
            }
            S.put(nums[i], i);
        }
        return null;
    }
}