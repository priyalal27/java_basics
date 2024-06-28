import java.util.ArrayList;

public class ListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i = i + 10) {
            list.add(i);
        }
        System.out.println("List" + list);

        //add at index
        list.add(5, 505);
        System.out.println("List after addition at 5th Index" + list);


        list.set(8, 809);
        System.out.println("List after replacement "+ list);


        //second list 

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 24; i = i + 4) {
            list2.add(i);
        }

        System.out.println("List 2 values "+list2);


        // Append 2 collections 
        list.addAll(4, list2);

        //Print list after appending 2nd list at position 4
        System.out.println("Print List 1 after appending "+list);


        //check if a list contains certain value 
        boolean b= list.contains(4);
        System.out.println("List containment "+b);

        System.out.println("Element in the arraylist");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            list.remove(7);
            System.out.println("List after deletion "+ list);
        }
    }
}
