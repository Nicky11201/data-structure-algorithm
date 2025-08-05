package All_Uni_Question;

import java.util.*;
public class Q2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i = i + 1) {
            String [] parts = scanner.nextLine().split(" ");

            left.add(parts[0]);
            right.add(parts[1]);
        }

        for (int i = 0; i < left.size(); i = i + 1) {
            if (!right.contains(left.get(i))) {
                System.out.println(left.get(i));
            }
        }
    }
}
