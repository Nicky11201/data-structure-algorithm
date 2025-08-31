package arrays;
public class SortedArray {
    public static int removeDuplicates(int [] nums) {
        int count = 0;

        /*for (int i = 0; i < nums.length; i = i + 1) {
            boolean duplicate = false;
            for (int j = i + 1; j < nums.length; j = j + 1) {
                if (nums[i] == nums[j]) {
                    duplicate = true;
                }
            }

            if (!duplicate) {
                count = count + 1;
            }
        } */

        for (int i = 1; i < nums.length; i = i + 1) {
            if (nums[i] != nums[count]) {
                count = count + 1;
                nums[count] = nums[i];
            } 
        }

        return count + 1;
    }

    public static void main (String [] args) {
        int [] nums = {1, 1, 1, 2 , 2, 3, 5, 5};
        System.out.println(removeDuplicates(nums));
    }
}
