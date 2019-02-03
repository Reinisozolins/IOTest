import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPutStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream file= new FileOutputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\test.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeUTF("ggg");
        data.writeInt(66);
        data.flush();
        data.close();
        System.out.println(":))))");
    }
}
