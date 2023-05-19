import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }
    }
}



