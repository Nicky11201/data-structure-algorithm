import java.util.*;

public class TopKFrequentElemetns {
    public static void main (String [] args) {
        int [] nums = {7,7};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int [] answer = new int [k];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i = i + 1) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        } 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> entry : list) {
            if (index == k) {
                break;
            }
            answer[index] = entry.getKey();
            index = index + 1;
        }
        return answer;
        
    }
}
