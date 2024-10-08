package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];
            
            if (map.containsKey(Math.abs(diff))) {
                result = new int[] {map.get(diff), i};
            }

            map.put(nums[i], i);

        }

        return result;
    }

}
