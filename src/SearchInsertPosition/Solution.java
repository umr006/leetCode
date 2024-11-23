package SearchInsertPosition;

public class Solution {

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length && nums[i] <= target; i++) {
            if (nums[i] == target) {
                result = i;
            }
            result = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,10,22};
        int target = 22;
        System.out.println(searchInsert(nums, target));
    }
}
