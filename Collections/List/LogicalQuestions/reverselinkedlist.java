import java.util.Iterator;
import java.util.LinkedList;

public class reverselinkedlist {

    public static void main(String[] args) { 
        
        LinkedList ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
                ll.add(i);
        }

        Iterator itr =ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
            
        }

    }
}
