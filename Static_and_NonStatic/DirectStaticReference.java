public class DirectStaticReference {
    
    // create Object @ global level.
    static DirectStaticReference obj ;
    static DirectStaticReference obj1 = new DirectStaticReference();
    
    // static block

    static{
        System.out.println("inside Static block");
        System.out.println(DirectStaticReference.obj);
        DirectStaticReference.obj = new DirectStaticReference();

        DirectStaticReference.method11();
    }

    public static void main(String[] args) {
        System.out.println(DirectStaticReference.obj);
    }

    //output 
    // inside Static block
    // null
    // DirectStaticReference@372f7a8d


    // Create a reference in static method 
    public static void method11(){
        DirectStaticReference.obj1 = new DirectStaticReference();
    }

}
