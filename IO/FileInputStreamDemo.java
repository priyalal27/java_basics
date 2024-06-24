import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        int count = 0;
        FileInputStream fis = null ;
        try  {
             fis = new FileInputStream("D:\\JavaBasics\\IO\\notes.txt");
            int i;
            while ((i = fis.read()) != -1) {
                count++ ;
                System.out.print((char) i);

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
                fis.close();
        }

        System.out.println("Number of words "+ count);
    }
}
