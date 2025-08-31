package arrays;
public class MaxProduct {
    public static String maxProduct (int[] intArray) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i = i + 1) {
            if (intArray[i] > highest ) {
                secondHighest = highest;
                highest = intArray[i];
            } else if (intArray[i] > secondHighest && intArray[i] <= highest) {
                secondHighest = intArray[i];
            }
        }
        
        return highest + "," + secondHighest;
    } 

    public static void main (String [] args) {
        int[] intArray = {10,20,30,50,50};
        System.out.println(maxProduct(intArray));
    }

}
