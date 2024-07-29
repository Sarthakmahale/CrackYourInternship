class movezero {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }

    }

    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 3, 12 };
        movezero solution = new movezero();
        solution.moveZeroes(nums);

        System.out.print("Resulting array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}