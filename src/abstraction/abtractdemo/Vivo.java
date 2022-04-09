package abstraction.abtractdemo;

public class Vivo extends Mobile{

    public void call() {

        System.out.println("calling vivo");
    }
    public void message(){
        System.out.println("message vivo");
    }
    public void camera(){
        System.out.println("16mp");
    }
    public static void main(String[] args){
        Vivo v = new Vivo();
        v.call();
        v.message();
        v.camera();
        v.whatsapp();
    }
}
