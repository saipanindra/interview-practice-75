public class MinimumOperationsToMakeBinaryArrayElementsEqualToOne {

    public int minOperations(int[] nums) {
        int flips = 0;
        for (int i = 0 ; i < nums.length - 2; i++) {

            if (nums[i] == 0) {
                flip(nums, i);
                flip(nums, i+1);
                flip(nums, i+2);
                flips++;
            }
        }
        if (nums[nums.length - 1] == 0 || nums[nums.length - 2] == 0) {
            return -1;
        }
        return flips;
    }

    private void flip(int[] nums, int i) {
        if(nums[i] == 0) {
            nums[i] = 1;
            return;
        }
        nums[i] = 0;
    }
    
}
