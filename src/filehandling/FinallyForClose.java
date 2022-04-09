package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FinallyForClose {
    public static void main(String[] args) {

            File file =
                    new File("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava/bufferdemo.txt");
            FileOutputStream fileOutputStream = null;
            FileInputStream fileInputStream = null;
            try {
           fileOutputStream = new FileOutputStream(file);
            String str = "welcome";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
           fileOutputStream.write(arr);
            System.out.println("File write successfully");
            }catch (IOException e) {
                e.printStackTrace();
            }finally {
                {try {
                    fileOutputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                }


        }
    }
}



