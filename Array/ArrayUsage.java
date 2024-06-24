public class ArrayUsage {



    public static void main(String[] args) {
        
        int a[] = {10,20,30,40,50};
        
        int b[] = new int[5];

        b[1]= 10 ;

        for (int i = 0; i < b.length; i++) {
            System.out.println("a @ "+i+" index = "+a[i]);
            System.out.println("b @ "+i+" index = "+b[i]);
        }

        for(int p : a){
            System.out.println(p);
        }
    }
}
