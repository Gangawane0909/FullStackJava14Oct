package test;


import java.util.Scanner;

public class WeekDay  {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("friday");
                break;
        }
    }
}