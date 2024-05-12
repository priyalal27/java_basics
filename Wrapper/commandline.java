public class commandline {
 public static void main(String[] args) {
    int length=args.length;

    if (length>0) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);    
        }  
    }
    else
        System.out.println("No arguuments were passed");
 }   
}

// first compile : javac /go_to_the_folder/test.java
// now run : java test pass_some_arguments
