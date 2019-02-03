import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTestTwo {
    public static void main(String[] args) throws IOException {
        byte[] buf ={65, 66, 67, 100};
        ByteArrayInputStream byt=new ByteArrayInputStream(buf);
        int k=0;
        while ((k=byt.read())!=-1) {
            char ch=(char)k;
            System.out.println("ASCII vaulue of Character is: " +k+ " - special character is  "+ch);
        }
    }
}
