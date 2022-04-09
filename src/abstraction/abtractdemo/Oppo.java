package abstraction.abtractdemo;

public class Oppo extends Mobile{

    public void call() {
        System.out.println("calling oppo");
    }
    public void message() {
        System.out.println("message oppo");
    }
    public void camera() {
        System.out.println("48mp");
    }
    public static void main(String[] args){
        Oppo o = new Oppo();
        o.call();
        o.message();
        o.camera();
        o.whatsapp();
    }
}
