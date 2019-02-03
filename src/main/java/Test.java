import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        try {
            FileOutputStream fout;
            fout = new FileOutputStream("C:\\Users\\Reinis\\Desktop\\macibas\\inputoutput\\auto.txt");
            fout.write(66);
            fout.close();
            System.out.println("success... :D");
        } catch (Exception e){
            System.out.println(e);}
    }
}
