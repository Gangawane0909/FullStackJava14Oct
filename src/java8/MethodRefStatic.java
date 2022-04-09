package java8;

public class MethodRefStatic {
    public static void main(String[] args) {
        // method reference to static method
        //refer
        MyInterFace5 myInterFace5 = MethodRefStatic::add;
        //call
        System.out.println(myInterFace5.show());;
    }
    public static Integer add(){
        return 2;
    }
}

interface MyInterFace5{
    Integer show();
}

