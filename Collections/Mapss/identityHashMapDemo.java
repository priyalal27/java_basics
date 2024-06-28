import java.util.HashMap;
import java.util.IdentityHashMap;

public class identityHashMapDemo {


    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Priya");
        hm.put(1, "Divya");
        hm.put(2, "Divya");
// As hashmap removes duplicate values , the first entry will be removed as
// key matches in both case . 
        System.out.println("Print : "+hm.keySet());

        /*To execute duplicates keys , we can use identityhashmap */

    
        IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
        ihm.put(1, "Priya");
        ihm.put(1, "Divya");
        System.out.println("Print identity HashMap "+ihm.keySet());
    }
}
