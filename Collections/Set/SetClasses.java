import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetClasses {


    public static void main(String[] args) {
        


        Random rad = new Random(2);
         
        HashSet<Integer> hs= new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();


        for (int i = 0; i < 5; i++) {
            hs.add(rad.nextInt());
            lhs.add(rad.nextInt());
            ts.add(rad.nextInt());
        }

        System.out.println("HashSet : "+hs);
        System.out.println("LinkedHashSet : "+lhs);
        System.out.println("Treeset : "+ts);
        

        // use of iterator 

        Iterator itr =  hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }

    /*Hashset : does not follow in what order the elements inserted 
     *LinkedHashset : follows the order of insertion 
      Treeset : Sorts the element in ascending order
     */


}
