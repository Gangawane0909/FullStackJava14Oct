package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TryWithResources {
    public static void main(String[] args) {

            File file = new File("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava.txt");
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
                String str = "welcome";
                byte[] arr = str.getBytes();
           fileOutputStream.write(arr);
                System.out.println("File write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream(file)){
            int i = fileInputStream.read();
            while (i > 0) {
                System.out.println((char) i);
                i = fileInputStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}




