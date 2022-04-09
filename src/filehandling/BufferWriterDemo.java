package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter =
                    new FileWriter("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava/bufferwritedemo/txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Today is Thursday");
            System.out.println("File write successfully");

            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader =
                    new FileReader("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava/bufferwriterdemo/txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i > 0) {
                System.out.println((char) i);
                i = bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
            }
    }
}











