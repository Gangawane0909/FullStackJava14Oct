package multithreading;

public class DeamonThreadDemo extends Thread {
    public static void main(String[] args) {


        DeamonThreadDemo obj = new DeamonThreadDemo();
        obj.setDaemon(true);
        obj.start();

        System.out.println("In main");
        System.out.println(obj.isDaemon());


    }
    @Override
    public void run(){
        System.out.println("In run");
    }
}
