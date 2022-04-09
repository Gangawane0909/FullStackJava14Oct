package filehandling;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava.txt");
            fileWriter.write("Today is wednesday");
            System.out.println("File write is successfully");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("C:\\Users\\shivam\\IdeaProjects\\fullsatckjava.txt");
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        }catch (IOException e){
            e.printStackTrace();
            }


        }
    }




