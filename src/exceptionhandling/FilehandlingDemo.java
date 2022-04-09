package exceptionhandling;

import java.io.*;

public class FilehandlingDemo {

    public static void main(String[] args){
        File file = new File("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava\\src\\exceptionhandling\\test.txt");
        try {

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "welcome";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream FileInputStream = new FileInputStream(file);
            int i = FileInputStream.read();
            while (i > 0) {
                System.out.print((char) i);
                i = FileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}

