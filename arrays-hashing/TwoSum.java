import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {1, 2, 3, 4}, 7)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i = i + 1) {
            for (int j = i + 1; j < nums.length; j = j + 1) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {0};
    }
}