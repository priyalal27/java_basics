public class ArraySorting {

    public static void main(String[] args) {
        
        int a[] = {3,445,2,003,-22,2221,9,6,3};
        int j;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a.length; k++) {

                  
                if(a[i]<a[k])
            {
                    j=a[i];
                    a[i]=a[k];
                    a[k]=j;     
            }
            }
            
        }



        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if(a[i]==3){count++;}

        }

        System.out.println("Occurance of 3 = "+count);

    }



}
