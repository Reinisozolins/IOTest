import java.io.FileInputStream;
import java.io.SequenceInputStream;

//printing the data of two files
public class SequenceInputStreamTest {
    public static void main(String[] args) throws Exception {
        FileInputStream input1=new FileInputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\test.txt");
        FileInputStream input2=new FileInputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\filename.txt");
        SequenceInputStream inst=new SequenceInputStream(input1,input2);
        int j;
        while ((j=inst.read())!=-1){
            System.out.println((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
