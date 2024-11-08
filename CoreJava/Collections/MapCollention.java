package CoreJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollention {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        System.out.println("is empty: " + map.isEmpty());
        
        map.put("a",2);
        map.put("b",56);
        map.put("c", null);
        map.put("d",1);
        map.put("e",33);

        
        System.out.println("keys: " + map.keySet());
        System.out.println("is empty: " + map.isEmpty());
        System.out.println("values: " + map.values());
        
        System.out.println("get entryset: " + map.entrySet());
        System.out.println("get hascode: " + map.hashCode());
        System.out.println("size: " + map.size());
        System.out.println("tostring: " + map.toString());
        System.out.println("contains 'm': " + map.containsKey("m"));
        System.out.println("contains 'e': " + map.containsKey("e"));
        System.out.println("contains 56 value: " + map.containsValue(56));
        System.out.println("replace key: " + map.replace("c", 123));
        
        // System.out.println("clear: " + map.clear());
        // map.clear();
        map.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));

        map.entrySet().forEach(entry -> System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue())); 

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
