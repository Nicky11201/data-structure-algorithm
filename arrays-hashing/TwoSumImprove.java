import java.util.HashSet;

public class TwoSumImprove {
    public static void main(String [] args) {
        int [] nums = {1, 2, 3, 4};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int [] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (Integer n : nums) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                return true;
            }
        }

        return false;
    }
}
