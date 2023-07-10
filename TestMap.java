import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map <Integer, String> hMap = new HashMap<>();
        hMap.put(1, "One");
        hMap.put(2, "Two");
        hMap.putIfAbsent(3, "Three");
        System.out.println(hMap);
        System.out.println(hMap.get(1));
        System.out.println(hMap.containsKey(1));
        System.out.println(hMap.containsValue("One"));
        System.out.println(hMap.keySet());
        System.out.println(hMap.values());
        hMap.remove(3);
        System.out.println(hMap);
        for (var item : hMap.entrySet()) {
            System.out.println(item);            
        }


    }
}
