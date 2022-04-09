package assignment;

import java.util.ArrayList;
import java.util.List;

public class Important implements Comparable<Important> {
    int id;
    String name;
    String address;

    public Important(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {


        Important obj = new Important(2, "abhishek", "Mumbai");
        Important obj1 = new Important(2, "Rakesh", "Pune");
        Important obj2 = new Important(3, "Nilesh", "Mirajgon");

        List<Important> list = new ArrayList<>();

        list.add(obj);
        list.add(obj1);
        list.add(obj2);
    }

    @Override
    public int compareTo(Important o) {
        return 0;
    }
}





