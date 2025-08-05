package All_Uni_Question;
import java.util.*;

public class Q1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i = i + 1) {
            String [] text = scanner.nextLine().split(" ");

            if (!map.containsKey(text[0])) {
                map.put(text[0], Integer.parseInt(text[1]));
                System.out.println("Play " + text[0]);
            } else {
                if (map.get(text[0]) < Integer.parseInt(text[1])) {
                    System.out.println("Play " + text[0]);
                } else {
                    System.out.println("Skip " + text[0]);
                    map.put(text[0], Integer.parseInt(text[1]));
                }
            }

        }
    }
}