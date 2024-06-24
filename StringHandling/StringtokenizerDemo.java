import java.util.StringTokenizer;

public class StringtokenizerDemo {


    public static void main(String[] args) {
        String s ="My Name is Priya Lal";

        StringTokenizer st= new StringTokenizer(s," ");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
