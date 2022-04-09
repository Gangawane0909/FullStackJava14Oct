package polymorphism;

public class Rbi {

    public void interest() {
        System.out.println("Rbi interest");
    }
}
class SBI extends Rbi {

    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.interest();
    }

    @Override
    public void interest() {
        System.out.println("SBI interest 8");
        int a=8;

    }
}
class HDFC extends Rbi {

    public static void main(String[] args) {
        Rbi obj = new HDFC();
        obj.interest();
    }

    @Override
    public void interest() {
        System.out.println("HDFC interest");
        int a = 7 ;
    }



}

class KOTAK extends Rbi {
    public static void main(String[] args) {
        Rbi obj = new KOTAK();
        obj.interest();
    }

    @Override
    public void interest() {
        System.out.println("KOTAK interest");

    }

}








