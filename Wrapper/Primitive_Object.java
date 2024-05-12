public class Primitive_Object {
    
    public static void main(String[] args) {
        int x= 100; 
        
       // Primitive ---> Object : Autoboxing
        Integer intval=Integer.valueOf(x);
        System.out.println(intval);

        // Object --> Primitive : Unboxing
        int y =intval.intValue();
        System.out.println(y);


        // primitive to string 
        char c= 'q';
        System.out.println(Character.toString(c));
    }
}
