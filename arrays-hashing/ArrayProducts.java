import java.util.*;
public class ArrayProducts {
    public int [] productExceptSelf(int [] nums) {
        int [] prefix = new int [nums.length];
        int [] postfix = new int [nums.length];
        int [] answer = new int [nums.length];
        int n = nums.length;
        for (int i = 0; i < nums.length; i = i + 1) {
            if (i > 0) {
                prefix[i] = prefix[i - 1] * nums[i]; 
            } else {
                prefix[i] = nums[i];
            }
        }

        for (int i = n - 1; i >= 0; i = i - 1) {
            if (i < n - 1) {
                postfix[i] = postfix[i + 1] * nums[i];
            } else {
                postfix[i] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i = i + 1) {
             if (i == n - 1) {
                answer[i] = prefix[i - 1];
            } else if ( i == 0) {
                answer[i] = postfix[i + 1];
            } else {
                answer [i] = prefix[i -1] * postfix[i + 1];
            }
        }
        return answer;
        
    }
}
