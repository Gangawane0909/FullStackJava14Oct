package polymorphism;

/**
 * methods overriding
 * if two class have same method name and same singnature
 * advantage=> we are implementing parent class method in child class
 */

public class Animal {

    public void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("dog sound");

    }
        public static void main(String[] args){
        Dog obj = new Dog();
        obj.sound();


    }
}