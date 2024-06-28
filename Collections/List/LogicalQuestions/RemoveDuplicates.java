import java.util.ArrayList;

public class RemoveDuplicates {


    public static void main(String[] args) {
        

        ArrayList list = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                list.add(i);
            }
        }

        System.out.println("List "+list);


        ArrayList newList = new ArrayList<>();

        for (Object object : list) {
            if (!newList.contains(object))
                {
                    newList.add(object);
                }
            
        }

        System.out.println("NewList "+newList);
    }

}
