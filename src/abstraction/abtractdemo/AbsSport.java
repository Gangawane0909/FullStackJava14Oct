package abstraction.abtractdemo;

  public abstract class AbsSport {

    public  abstract void play();//abstract method

    public void exercise(){//concrete method
       System.out.println("In exercise");
    }
}










//we can declare abstract class using abstract keyword                 1. using interface
//we have both method abstract and concrete                             2. only abstract
//abstract class can extends another class or implement interface      3.only interface can extend
//we have private,protected,public method                              4.only public
//partial abstract                                                     5.100% abstraction