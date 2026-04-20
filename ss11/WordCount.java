import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "hello world hello java world hello";

        str = str.toLowerCase();

        String[] words = str.split(" ");

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}