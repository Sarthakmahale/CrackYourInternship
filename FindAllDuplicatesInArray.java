import java.util.ArrayList;
import java.util.List;

class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0)

                resultSet.add(index + 1);

            nums[index] = nums[index] * -1;
        }
        return resultSet;
    }

    public static void main(String args[]) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        FindAllDuplicatesInArray s = new FindAllDuplicatesInArray();
        System.out.println(s.findDuplicates(nums));
    }
}