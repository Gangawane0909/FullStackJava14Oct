package assignment;

import java.time.DayOfWeek;
import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the day");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
       switch(num){
           case 1:
               System.out.println("Sunday");
               break;
           case 2:
               System.out.println("Monday");
               break;
           case 3:
               System.out.println("Thursday");
               break;
           case 4:
               System.out.println("Friday");
               break;
           default:
               System.out.println("Do not match day");
       }
    }

}
