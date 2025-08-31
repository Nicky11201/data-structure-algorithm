package arrays;
public class IsUnique {
    public boolean isUnique (int [] intArray) {
        for (int i = 0; i < intArray.length; i = i + 1) {
            for (int j = i + 1; j < intArray.length; j = j + 1) {
                if (intArray[i] == intArray[j]) {
                    return false;
                }
            }
        } 
        return true;
    }
}
