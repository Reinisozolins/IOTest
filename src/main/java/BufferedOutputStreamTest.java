import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout= new FileOutputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\test.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s="Testējam";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("izdevās");
    }
}
