package constructor;


/**
 * Constructor -> it is special type function which invoke automatically
 * when you create object of class
 *
 * Rules to create constructor ->
 * 1.your class name and Constructor name should be same
 * 2.there should be no
 * 3.static,final,synchronized keyword are not allowed with constructor
 *
 * Type of constructor->
 * default Constructor
 * parametrized constructor
 *
 * Advantage of Constructor->
 * it initializes variable to their default values
 */


public class ConstructorDemo {

    int id;
    String name;
    Boolean flag;

       public ConstructorDemo() {
        System.out.println("id=> "+ id + "name=>" + name + "flag=>" + flag);
    }
    public ConstructorDemo(int i) {
        System.out.println("In parameter Constructor");

       }
        public static void main (String[] args){
            ConstructorDemo obj = new ConstructorDemo(9);
            ConstructorDemo obj1 = new ConstructorDemo();




        }

    }







