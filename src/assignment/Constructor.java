package assignment;

public class Constructor {
    int id;
    String name;
    Boolean flag;
    public Constructor() {
        System.out.println("id=>" + "id" + "name=>" + "name" + "flag=>" + "flag");
    }
    public Constructor(int i) {
        System.out.println("In parameter Constructor");
    }



    public static void main(String[] args) {
        Constructor obj = new Constructor(9);
        Constructor obj1 = new Constructor();
    }
    }





