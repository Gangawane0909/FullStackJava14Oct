//package exceptionhandling;
//
//import java.io.*;
//
//public class FileWriteDemo {
//
//    public static void main(String[] args) {
//        //character stream
//        File file = new File("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava\\src.txt");
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            String str = " I am in pune";
//            FileWriter.write(str);
//            System.out.println("file write successfully");
//            FileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            FileReader fileReader = new FileReader(file);
//            int i = fileReader.read();
//            while (i > 0) {
//                System.out.print((char) i);
//                i = fileReader.read();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
