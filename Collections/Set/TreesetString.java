import java.util.TreeSet;

public class TreesetString {

    public static void main(String[] args) {
        
        TreeSet tst = new TreeSet<>();

        tst.add("xcv");
        tst.add("ert");
        tst.add("xcv");
        tst.add("qqr");
        
        for (Object object : tst) {
            System.out.println(object);
        }
    }

    /* Treeset do the sorting and removes duplicates */

}
