import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {



    public static void main(String[] args) {
        
        try (FileReader f = new FileReader("non_existance.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Always executes");
        }
        


    }
}


/*In Java, checked exceptions are the exceptions that are checked at compile-time. 
This means that the code must handle these exceptions either by using a try-catch block or 
by declaring them in the method signature with the throws keyword.

Checked exceptions are used to represent conditions
 that a reasonable application might want to catch.
They encourage error handling because the compiler
 will not allow the program to compile without handling these exceptions. */


 /*Finally always executes , it is good place to close all the connections.
  * Finally can be use with multi catch also . 
   */