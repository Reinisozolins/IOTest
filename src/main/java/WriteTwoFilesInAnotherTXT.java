import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.sql.SQLOutput;

public class WriteTwoFilesInAnotherTXT {
    public static void main(String[] args) throws Exception {
        FileInputStream fin1 = new FileInputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\test.txt");
        FileInputStream fim2 = new FileInputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\filename.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\testout.txt");
        SequenceInputStream sis = new SequenceInputStream(fin1, fim2);
        int i;
        while ((i = sis.read()) != -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fim2.close();
        System.out.println("Izdevās");
    }
}
