import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> helperMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length; i++)
        {
           helperMap.put(nums[i], i);
        }

        for (int i = 0 ; i < nums.length; i++)
        {
            Integer theOtherIndex = helperMap.get(target - nums[i]);
            if (theOtherIndex != null && theOtherIndex != i)
            {
               result[0] = i;
               result[1] = theOtherIndex;
            }

        }
        return result;
    }
}
