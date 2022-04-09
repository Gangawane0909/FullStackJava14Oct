package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapArrayList {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Mumbai");
        map.put(1, "Mumbai");
        map.put(2, "Nashik");

        Map<Integer, String> map1 = new HashMap<>();

        map.put(1, "Mumbai");
        map.put(1, "Mumbai");
        map.put(2, "Nashik");


        Map<Integer, String> map2 = new HashMap<>();

        map.put(1, "Mumbai");
        map.put(1, "Mumbai");
        map.put(2, "Nashik");


        List<Map<Integer, String>> list = new ArrayList<>();

        list.add(map);
        list.add(map1);
        list.add(map2);


        map.forEach((k, v) -> {
            System.out.println(k + " " + v);

        });
    }
}





