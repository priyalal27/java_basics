import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {


public static void main(String[] args) {
    
    ArrayList list = new ArrayList<>();
    Random rad = new Random();
    for (int i = 0; i < 10; i++) {
        list.add(rad.nextInt(5));
    }

    // Arraylist Prints out all values including duplicates
    System.out.println("List value : "+ list);

    //Hashset only prints the unique values .
    HashSet set = new HashSet<>(list);
    System.out.println("Set Value : "+set);

}



}
