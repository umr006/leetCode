package RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int uniqueCnt = 0;

        for(int i : nums) {
            if (uniqueCnt == 0 || i != nums[uniqueCnt -1]) {
                nums[uniqueCnt++] = i;
            }
        }
        return uniqueCnt;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,4,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
