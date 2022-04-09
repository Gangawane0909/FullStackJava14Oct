package inheritance;

public class Teacher {

    int id;
    String name;
    String address;

}
class MathsTeacher extends Teacher{


    public static void main(String[]args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Shradha";
        obj.address = "mirajagon";

        System.out.println("id=>" + obj.id + " name=>" + obj.name + "address=>" + obj.address);
    }
}


class ChemistryTeacher extends Teacher{

    public static void main(String[]args){
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 2;
        obj.name ="Shradha";
        obj.address = "mirajagon";

        System.out.println("id =>" + obj.id + " name=>" + obj.name + " address=>" + obj.address);
    }

}





















