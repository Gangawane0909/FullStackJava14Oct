package polymorphism;

/**
 * the ability to take one form to many form
 * or
 * one thing have many action
 *
 * method overloading => if class have multiple methods with same name but different number of argument/parameters
 * Rule =>
 * 1.Number of argument should be different.
 * 2.return type should be different
 * 3.changing the data type of parameter
 *
 * Advantage=> it increse the readability of program
 */

public class PolymorphismDemo {

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a,int b,int c) {
        return a + c + c;
    }

    public static void main(String[] args){
        PolymorphismDemo obj = new PolymorphismDemo();
        int c = obj.add(2,4 );


        System.out.println(c);
    }
}
