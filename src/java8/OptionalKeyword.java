package java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalKeyword {
    public static void main(String[] args) {
        Employee obj = new Employee(1,"Komal",null);
        System.out.println(obj.getAddress());

        if(obj.getAddress()!=null) {
            System.out.println(obj.getAddress().toLowerCase());
        }else {
            System.out.println("Address is null");

        }
        Optional<Integer> optional= Optional.empty();
        System.out.println(optional);

        System.out.println();

        try {
            Optional<String>optional1 = Optional.of(obj.getAddress());// it returns exception when optional is null
            System.out.println(optional);
        }catch (NullPointerException e){
            e.printStackTrace();

        }
        Optional<String> optional2= Optional.ofNullable(obj.getAddress());// it returns empty when optional is null
        System.out.println(optional2);

        Optional<String>optional3 = Optional.ofNullable(obj.getName());
        System.out.println(optional3.orElse("Address is null"));

        String st ="Address is null";
        Optional<String>optional4= Optional.ofNullable(obj.getAddress());
        System.out.println(optional4.orElseGet(()-> st));

        Optional<String>optional5 = Optional.ofNullable(obj.getAddress());
        System.out.println(optional5.orElseThrow());

        Optional<String>optional6 = Optional.ofNullable(obj.getAddress());
        System.out.println(optional6.orElseThrow(()-> new NullPointerException ("Address is null")));


    }
}
class Employee{
    int id;
    String Name;
    String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(int id, String Name, String address){
        this.id=id;
        this.Name=Name;
        this.address=address;


    }
}
