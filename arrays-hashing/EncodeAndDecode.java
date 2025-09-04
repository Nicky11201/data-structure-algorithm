import java.util.*;
public class EncodeAndDecode {
    public static void main (String [] args) {
        
    }

    public String encode(List<String> strs) {
        String answer = "[";
        for (String word : strs) {
            System.out.print("\""+ word +"\"" + ",");
            answer = answer + "\""+ word +"\"" + ",";
        }
        for (int i = 0; i < strs.size(); i = i + 1) {
            if (i == strs.size() - 1) {
                answer = answer + "\""+ strs.get(i) +"\"" + ",";
            } else {
                answer = answer + "\""+ strs.get(i) +"\"";
            }
        }
        answer = answer + "]";
        return answer;
    }

    public List<String> decode (String str) {
        String [] store = str.split(" ");
        List<String> list = new ArrayList<>();
        for (String word : store) {
            list.add(word);
        }
        return list;
    }


}
