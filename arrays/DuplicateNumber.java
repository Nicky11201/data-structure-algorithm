package arrays;
import java.util.Arrays;
public class DuplicateNumber {
    public static int [] removeDuplicates(int [] arr) {
        boolean [] check = new boolean [arr.length];
        int size = arr.length; 

        for (int i = 0; i < arr.length; i = i + 1) {
            for (int j = i + 1; j < arr.length; j = j + 1) {
                if (arr[i] == arr[j]) {
                    check[j] = true;
                    size = size - 1;
                } 
            }
        }

        int [] answer = new int[size];
        int k = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            if (!check[i]) {
                answer[k] = arr[i];
                k = k + 1;
            } 
    }

        return answer;
    }

    public static void main (String [] args) {
        int [] array = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }
}
