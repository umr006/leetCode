package RemoveElement;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int newLenght = 0;
        for (int num : nums) {
            if (num != val) {
                nums[newLenght++] = num;
            }
        }
        System.out.println(nums[0]);
        return newLenght;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,2,2,2,3,3,3,4,4,4,4,1};
        int target = 1;
        System.out.println(removeElement(nums, target));
    }
}
