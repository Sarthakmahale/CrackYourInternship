import java.util.HashMap;

class SubarraySumsDivisiblebyK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int sum = 0;
        int rem = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        SubarraySumsDivisiblebyK s = new SubarraySumsDivisiblebyK();

        System.out.println(s.subarraysDivByK(nums, k));
    }
}