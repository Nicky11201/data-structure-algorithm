package arrays;
public class MissingNumber {
    public static int findMissingNumberInArray(int [] arr) {
        int n = arr.length + 1;
        int expected = (n* (n + 1))/2;

        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            sum = sum + arr[i];
        }

        int answer = expected - sum;
        return answer;
    }

    public static void main (String [] args) {
        int [] myArray = {1, 2, 3, 4, 6};
        int answer = findMissingNumberInArray(myArray);
        System.out.println(answer);
    }
} 
