package Core;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("1", 1);
        map1.put("2", 2);
        map1.put("3", 3);

        map2.put("4", 4);
        map2.put("5", 5);
        map2.put("6", 6);

        Map<String, Integer> map = new HashMap<>();
        map.putAll(map1);
        map.putAll(map2);
        
        map1.putAll(map2);
        
        System.out.println(map1);
    }
}
