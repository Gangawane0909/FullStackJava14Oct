package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator {
    int id;
    String name;
    String address;

    public StudentComparator(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;


    }

    public static void main(String[] args) {
        StudentDemo obj = new StudentDemo(123, "Nilesh", "Pune");
        StudentDemo obj1 = new StudentDemo(123, "Nilesh", "Pune");
        StudentDemo obj2 = new StudentDemo(425, "Suhas", "Mumbai");

        List<StudentDemo> list = new ArrayList<>();

        list.add(obj);
        list.add(obj1);
        list.add(obj2);

        Comparator<StudentComparator> comparator = new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                if(o1.id==o2.id) {
                    return 0;
                }else if(o1.id>o2.id) {
                    return 1;
                }else {
                    return -1;
                }
            }
            };
        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });
    }

}

