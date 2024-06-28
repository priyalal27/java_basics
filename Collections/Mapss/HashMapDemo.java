import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {



    public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>();
    
    hm.put(1,"Priya");
    hm.put(2,"Divya");
    hm.put(3,"Hina");
    hm.put(4,"Aahan");

    // navigating through keys
    Set<Integer> keys=hm.keySet(); 
    System.out.println("Keys "+keys);


    //navigating through values
    Collection val =hm.values();
    System.out.println("Values :"+val);


    //printing both key and value together 

    for (Object object : keys) {
        System.out.println("Keys "+object+" Values "+hm.get(object));
    }
        
    }
}
