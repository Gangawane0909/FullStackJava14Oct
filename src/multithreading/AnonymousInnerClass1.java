package multithreading;

public class AnonymousInnerClass1 {
    public static void main(String[] args) {
      MyInterface myInterface = new MyInterface() {
          @Override
          public String msg() {
              return "Hii";
          }

      };
        System.out.println(myInterface.msg());



    }
    interface MyInterface{
        String msg();

    }

}
