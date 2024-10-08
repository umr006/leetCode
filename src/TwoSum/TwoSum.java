package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(Math.abs(diff))) {
                result = new int[] {map.get(Math.abs(diff)), i};
            }
            map.put(nums[i], i);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2,17,11,15,18,6,7};
        int target = 9;
        int res[] = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }

}
