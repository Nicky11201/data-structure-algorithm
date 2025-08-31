package arrays;
import java.util.Arrays;
public class TwoSum {
    public static int [] twoSum (int [] nums, int target) {
        int next = 0;
        int current = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            for (int j = i + 1; j < nums.length; j = j + 1) {
                if (nums[i] + nums[j] == target) {
                    current = i;
                    next = j;
                }
            }
        }

        return new int [] {current, next};
    }

    public static void main (String [] args) {
        int [] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
