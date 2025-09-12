import java.util.*;

public class DailyTemperature {

    public static void main (String [] args) {
        int [] temperature = {22, 21, 20};

        System.out.print(Arrays.toString(dailyTemperature(temperature)));
    }
 
    public static int [] dailyTemperature(int [] temperature) {
        Stack<Integer> stack = new Stack<>();
        int [] answer = new int[temperature.length];

        for (int i = temperature.length - 1; i >= 0; i = i - 1) {
            while (!stack.isEmpty() && temperature[i] > temperature[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return answer;
    }
}
