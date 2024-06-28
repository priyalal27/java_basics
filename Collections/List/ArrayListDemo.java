import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {
        

        ArrayList list = new ArrayList<>();

        list.add(new Integer(22));
        list.add(20);
        list.add("Priya");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Restricting the data type of an arraylist
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(22);
        list2.add(20);
        //list2.add("Priya");


        
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}