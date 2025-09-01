/*  
 * This solution has a time complexity of O(n^2 * m log m). 
 * I’ll optimize it later — for now, I just aimed for a quick working solution 
 * without focusing on efficiency.
 */

import java.util.*;

public class GroupAnagrams {
    public static void main (String [] args) {
        String [] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String [] strs) {
        boolean [] check = new boolean[strs.length];
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i = i + 1) {
            
            if (check[i] == true) {
                continue;
            }
            List<String> answer = new ArrayList<>();
            answer.add(strs[i]);
            char [] store = strs[i].toCharArray();
            Arrays.sort(store);
            for (int j = i + 1; j < strs.length; j = j + 1) {
                if (strs[i].length() == strs[j].length()) {
                char [] store1 = strs[j].toCharArray();
                Arrays.sort(store1);
                if (Arrays.equals(store, store1)) {   
                    answer.add(strs[j]);
                    check[j] = true;           
                }   

                }
                
            }

            list.add(answer);
        }
        return list;
    }

}
