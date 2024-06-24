import java.lang.reflect.Array;

public class DuplicateArray {



    public static void main(String[] args) {
        int a[] = {3,445,2,003,-22,2221,9,6,3};
        int b[]= new int[a.length];
        int duplicate ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                  if(a[i]!=a[j+1])
                  {
                      b[i]=a[i];
                        continue;

                  }
                  else 
                     break;
            }
        }


        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ,");
        }
    }
}
