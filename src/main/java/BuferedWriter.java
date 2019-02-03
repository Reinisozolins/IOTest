//A classic BufferedWriter example to write content to a file, create the file if doesn’t exist, the existing content will be overridden.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuferedWriter {
    public static final String FILENAME = "C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\filename.txt";

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String content = "This is the  content to write into file\n";
            String cat = "cat cat cat";
            String dog = "dog dog dog";


            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            bw.write(content+ "\n");
            bw.newLine();
            bw.write(cat);
            bw.write(dog);

            System.out.println("done");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {

                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            }catch (IOException ex){
                ex.printStackTrace();

            }
        }
    }
}















