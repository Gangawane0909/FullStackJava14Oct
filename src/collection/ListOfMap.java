package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"pune");
        map.put(2,"nashik");
        map.put(3,"Mumbai");

        Map<Integer,String> map1 = new HashMap<>();

        map.put(1,"pune");
        map.put(2,"nashik");
        map.put(3,"Mumbai");


        Map<Integer,String> map2 = new HashMap<>();

        map.put(1,"pune");
        map.put(2,"nashik");
        map.put(3,"Mumbai");

        List<Map<Integer,String> >list =new ArrayList<>();

        list.add(map);
        list.add(map1);
        list.add(map2);

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
    }



