import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }
        int best = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int y = x;
                while(set.contains(y)) {
                    y = y + 1;
                }
                best = Math.max(best, y - x);
            }
        }
        return best;
    }
}