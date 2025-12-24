public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                if (mid  - 1 >= 0 && nums[mid - 1] < target) {
                    return mid;
                }
                high = mid -1;
            }
            else if (nums[mid] < target) {
                if (mid + 1 <= nums.length - 1 && nums[mid+1] > target) {
                    return mid + 1;
                }
                low = mid + 1;
            }

       }
       return -1;
        
    }
}