package multithreading;

public class InnerThreadComm {
    int num;

    boolean flag = true;

    public synchronized void setNum(int num){
        if(!flag){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("set:" + num);
        this.num = num;
        flag = false;
        notify();
    }
    public synchronized void getNum() {
        if(flag){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("get:" + num);
        flag = true;
        notify();

    }
}
class producer implements Runnable {

    public InterThreadComm interThreadComm;

    public producer(InterThreadComm interThreadComm){
        this.interThreadComm = interThreadComm;
        Thread t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run(){
        int i = 0;
        while (true){
            interThreadComm.setNum(i++);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class consumer implements Runnable{
    public InterThreadComm interThreadComm;

    public consumer(InterThreadComm interThreadComm){
        this.interThreadComm = interThreadComm;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run(){
        while (true){
            interThreadComm.getNum();
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class InterThreadMain{
    public static void main(String[] args) {

       InterThreadComm interThreadComm = new InterThreadComm();

        producer producer = new producer(interThreadComm);
        consumer consumer = new consumer(interThreadComm);


    }

}