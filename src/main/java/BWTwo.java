import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BWTwo {
    public static final String FILENAME = "C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\buferwritertwo.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name =sc.next();
     try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
         System.out.println("Testēju");
         String content = "this is test";
         String testName= name;
         String cont = "Hi ";
         bw.write(content);
         bw.newLine();
         bw.write(cont);
         bw.write(testName);
         bw.newLine();
         bw.write(name);

         System.out.println("Program works");
     } catch (IOException e){
         e.printStackTrace();
     }
    }
}
