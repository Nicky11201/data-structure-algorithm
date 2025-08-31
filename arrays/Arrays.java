package arrays;
import java.util.*;

public class Arrays {
    public static int sumDiagonalElements(int [][] array) {
        int sum = 0; // O(1)

        for (int i = 0; i < array.length; i = i + 1) { //O(n)
               sum = sum + array[i][i];
        }
        return sum;
    }

    public static void main (String [] args) {
       int [][] myArray2D = {{1,2,3},{4,5,6},{7,8,9}};

       System.out.println(sumDiagonalElements(myArray2D));

    } 
}
