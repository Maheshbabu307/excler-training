import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 1;
        int prev = nums[0];
        for (int num : Arrays.copyOfRange(nums, 1, nums.length)) {
            if (num != prev) {
                nums[j] = num;
                j++;
            }
            prev = num; 
        }
        return j;
}
}