package assignment;

import collection.StudentDemo;

import java.util.ArrayList;
import java.util.List;

public class Sort1 implements Comparable<Sort1> {
    int id;
    String name;
    String address;

    public Sort1(int id, String name, String address) {
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

    }

    @Override
    public int compareTo(Sort1 o) {
        if(this.id == o.id) {
            return 0;
        } else if ((this.id > o.id)) {

            return 1;
        }else {
            return -1;
        }

        }
    }



