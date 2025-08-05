package All_Uni_Question;

import java.util.*;

public class Q3 {
    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);

    String [] input = scanner.nextLine().split(" ");
    ArrayList<Integer> discount = new ArrayList<>();
    int sum = 0;
    
    for (int i = 0; i < Integer.parseInt(input[0]); i = i + 1) {
        String [] price = scanner.nextLine().split(" ");
        discount.add(Integer.parseInt(price[0]) - Integer.parseInt(price[1]));
    }

    for (int i = 0; i < Integer.parseInt(input[1]); i = i + 1) {
        int highest = discount.get(i);
        for (int j = 0; j < discount.size(); j = j + 1) {
            if (discount.get(j) > highest) {
                highest = discount.get(j);
            }
        }

        sum = sum + highest;
        discount.remove(Integer.valueOf(highest));
    }
    System.out.println(sum);
} 
}
