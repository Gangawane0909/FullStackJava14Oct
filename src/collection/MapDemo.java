package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
      // key map can not be duplicate.
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"pune");
        map.put(2,"pune");
        map.put(3,"pune");

        System.out.println(map);

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
//