public class StringBufferDemo {


    public static void main(String[] args) {
        

        String s1 ="My Name is Priya. ";
        String s2= "I work with Appzen Labs. ";

        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.substring(4,6));
    }


    /*
    Property	    String	        StringBuilder	        StringBuffer
    Mutability	    Immutable	    Mutable	                 Mutable
    Memory Usage	High overhead	Efficient	              Slightly less efficient (due to synchronization)
    Thread Safety	Thread-safe 	Not thread-safe        	Thread-safe (synchronized methods)
    Use Case	    Constants, literals, keys	Dynamic string building (single-threaded)	Multi-threaded environments */

}
