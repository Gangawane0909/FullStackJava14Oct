package collection;

import java.util.*;

public class Student {

    int id;
    String name;
    String address;


    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {

        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {
        Student obj = new Student(1, "Nilesh", "Pune");
        Student obj1 = new Student(1, "Nilesh", "Pune");
        Student obj2 = new Student(2, "Mahesh", "Mumbai");


        Set<Student> set = new HashSet<>();
        set.add(obj);
        set.add(obj1);
        set.add(obj2);


        System.out.println(set);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());

        set.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);

        });
    }
}



              //Generate -> equal() and hashcode()-> next ->next ->Finish.
              //hashcode-> value negative and positive