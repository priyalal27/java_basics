import java.util.ArrayList;

public class reverseArrayList {



    public static void main(String[] args) {

        
        ArrayList<Double> list2 = new ArrayList<>();
        for (int i = 0; i <= 24; i = i + 4) {
            list2.add(Math.random());
        }


        System.out.println("reversed arraylist "+list2.reversed());
        
    }
}
