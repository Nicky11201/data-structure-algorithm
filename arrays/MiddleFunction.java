import java.util.Arrays;
//import java.util.*;

public class MiddleFunction {
    public static int [] middle (int [] array) {
        int size = array.length - 2;
        int [] newArray = new int [size];

        for (int i = 0; i < size; i = i + 1) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    } 

    public static void main (String [] args) {
        int [] myArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(myArray)));
    }
}
