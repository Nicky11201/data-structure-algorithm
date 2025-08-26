import java.util.Arrays;
//O(nlogn)
public class Permutation {
    public static boolean permutation(int [] array1, int [] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i = i + 1) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main (String [] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};

        System.out.println(permutation(array1, array2));
    }
}
