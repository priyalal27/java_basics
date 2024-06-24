public class StringsMethodDemo {

    public static void main(String[] args) {
        

        String s1= "Hello";

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.substring(2, 4));
        System.out.println(s1.contains("i"));


        String s2= "My name is Priya Lal";
        String s4= s2.replace("i", "iiii");
        String s3[]=s4.split(" ");
        for (int i = 0; i < s3.length; i++) {
            System.out.println("Split values "+s3[i]);
        }
    }

}
