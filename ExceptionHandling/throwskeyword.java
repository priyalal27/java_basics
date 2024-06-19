import java.io.File;
import java.io.FileNotFoundException;

public class throwskeyword {


    public void readfile()throws    FileNotFoundException{
        File f= new File("null");
    }
 
    public static void main(String[] args) throws FileNotFoundException{
        throwskeyword tk = new throwskeyword();
        
        /*to handle throws in method i can handle  it via try and catch or I can add 
         * throws in the main method and let JVM handle it .
        */
        // try{tk.readfile();}
        // catch(FileNotFoundException e){
        //     System.out.println(e.getMessage());
        // }
        
        // Here JVM is handling file not found exception .
        tk.readfile();
    }



}
