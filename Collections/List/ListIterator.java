import java.util.LinkedList;
import java.util.Random;

public class ListIterator {


    public static void main(String[] args) {
        

        Random rad = new Random();
        LinkedList ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(rad.nextInt());

        }
        
            ListIterator li = ll.listIterator();
        System.out.println("Forward Iteration :");
        while (li.has) {
            
        }

    }

}
