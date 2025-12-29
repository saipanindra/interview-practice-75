public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLengthSubArrayWithSum = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;

        int slidingWindowSum = nums[left]; // [2,1,5,1,5,3] // sws = 2, 3, 8, 9, 14, 12, 11,6, 9 t = 10

        while (right < nums.length) { // r = 0,1,2,3,4, 5

            if (slidingWindowSum >= target) {
                minLengthSubArrayWithSum = Math.min(minLengthSubArrayWithSum, (right - left + 1));
                slidingWindowSum -= nums[left];
                left++; // 1, 2, 3
                if (left > right) {
                    right = left;
                }
                
            }
            else if (slidingWindowSum < target) {
                right++;
                if (right < nums.length) {
                    slidingWindowSum += nums[right];
                }
            }
        }
        if (minLengthSubArrayWithSum == Integer.MAX_VALUE) {
            return 0;
        }
        return minLengthSubArrayWithSum;

    }
}
