package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava/bufferdemo.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "welcome";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
            bufferedOutputStream.write(arr);
            System.out.println("File write successfully");

            bufferedOutputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
           try {
               FileInputStream fileInputStream =
                       new FileInputStream("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava/bufferdemo.txt");
               BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
               int i = bufferedInputStream.read();
               while (i > 0) ;
               System.out.println((char) i);

           }catch (Exception e){
               e.printStackTrace();

           }
    }
    }

