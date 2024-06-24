import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {


    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("D:\\JavaBasics\\IO\\notes.txt");
        FileOutputStream fos = new FileOutputStream("D:\\JavaBasics\\IO\\Copynotes.txt");
         int i ;

         while((i=fis.read())!=-1){
            fos.write(i);
         }
         fis.close();
         fos.close();


    }

}
