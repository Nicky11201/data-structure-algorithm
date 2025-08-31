package arrays;
import java.util.Arrays;

public class BestScore {
    public static int [] findTopTwoScores(int [] array) {
        int highest = Integer.MIN_VALUE; //first one;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        for (Integer e : array) {
            System.out.print(e + " ");
        }

        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > secondHighest && array[i] < highest) {
                secondHighest = array[i];
            }
        }
        int [] answer = {highest, secondHighest};

        return answer;
    }
    public static void main (String [] args) {
        int [] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
    }
}
