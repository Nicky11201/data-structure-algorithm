package arrays;
public class NumberInArray {
    public static int searchInArray (int [] intArray, int valueToSearch) {
        int index = 0;
        for (int i = 0; i < intArray.length; i = i + 1) {
            if (intArray[i] == valueToSearch) {
                index = i;
            }
        }
        return index;

    }

    public static void main (String [] args) {
        int[] intArray = {1,2,2, 4, 5, 10, 9, 0, 20};
        
        System.out.println(searchInArray(intArray, 20));
    }
}
