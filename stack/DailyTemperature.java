import java.util.*;

public class DailyTemperature {

    public static void main (String [] args) {
        int [] temperature = {22, 21, 20};

        System.out.print(Arrays.toString(dailyTemperature(temperature)));
    }
 
    public static int [] dailyTemperature(int [] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int [] answer = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i = i - 1) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
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
