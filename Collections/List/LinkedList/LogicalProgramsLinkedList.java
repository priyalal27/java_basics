import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LogicalProgramsLinkedList {

    public static void main(String[] args) {
        LogicalProgramsLinkedList lpll = new LogicalProgramsLinkedList();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        lpll.middlevalue(list);

        lpll.reverseLinkedList(list);
    }

    public List<Integer> middlevalue(LinkedList<Integer> listval) {
        int size = listval.size();
        List<Integer> l = new ArrayList<>();

        if (size % 2 == 0) {
            int index = size / 2;
            System.out.println("It's an even index, and there are two values: " + index + " and " + (index + 1));
            l.add(listval.get(index));
            l.add(listval.get(index + 1));
        } else {
            int index = size / 2;
            l.add(listval.get(index));
        }

        return l;
    }

    public void reverseLinkedList(LinkedList<Integer> listval) {
        listval.descendingIterator(); // Correct method name
        System.out.println("Reversed LinkedList: " + listval);
        System.out.println();
    }
}
