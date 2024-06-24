public class ImmutableDemo {


    public static void main(String[] args) {
        

        String s1= "Hello";
        String s2= "World";

        System.out.println("Before concatintion : s1--> "+s1 +"     s2-->"+s2);

        s1.concat(s2);

        System.out.println("After concatintion : s1--> "+s1 +"     s2-->"+s2);


        // String Pool 
        String a1= "Hello";
        String a2= "Hello";  
        
        System.out.println("Memory Address a1--> "+a1.hashCode());
        System.out.println("Memory Address a2--> "+a2.hashCode());

        a2=a1.concat(a2);
        
        System.out.println("Memory Address of a2 after concatenating--> "+a2.hashCode());


        /*String Comparison 
         * s1==s2 : This compares memeory location 
         * s1.equals(s2) : This compares values of s1 and s2.
         * 
         * if i use String a3 = new String ("Hello");
         * Here the memory location has been changed . 
         */


    }


 //    When we concatinate , there was a seperate object created by JVM . That is why before and 
 // after remains same .    
}
