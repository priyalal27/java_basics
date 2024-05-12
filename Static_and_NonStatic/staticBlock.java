public class staticBlock {
    

    public static void main(String[] args) {
        System.err.println("msin method");
    }

    // when a class is loaded , static block will be first executed . After static block main method 
    // will be executed . 
    // ideally we should add initilization , connection code in static block .
    static{
        System.out.println("Static block1");
    }

    // we can add multiple static block 
    static{
        System.out.println("Static block2");
    }
}
