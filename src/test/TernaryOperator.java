package test;

public class TernaryOperator {
  public static void main(String[] args) {
      int age = 17;
      if (age > 18) {
          System.out.println("You can vote");
      } else {
          System.out.println("You cant vote");
      }
      String str = age > 18 ?"You can vote":"You cant vote";
  }
}