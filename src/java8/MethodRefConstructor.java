package java8;

public class MethodRefConstructor {
    public static void main(String[] args) {
        //method reference to constructor
        //refer
        MyInterface4 MyInterface4 = MethodRefConstructor::new;
        //call
        MyInterface4.methodRef();

    }
    MethodRefConstructor(){
        System.out.println("In constructor");
    }
}
interface MyInterface4{
    MethodRefConstructor methodRef();
}
