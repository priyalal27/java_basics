import java.util.List;


public class testClass {

    public static void main(String[] args) {
        List<userListClass> lt1= new ArrayList<userListClass>();
        lt1.add(new user(22, Priya));
        lt1.add(new user(23, Divya));
        lt1.add(new user(24, Hina));

        System.out.println("Values"+ lt1);
        
    }

}
