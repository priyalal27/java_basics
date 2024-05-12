public class staticMethod {
    public static void main(String[] args) {
        System.out.println("Inside Main Method");        
        staticMethod.method1();
    }


    // static method needs to instantiate using class name . 

    static void method1(){

        System.out.println("Static Method1");
    }

    // we can call static method from static block as well . 

    static{
        System.out.println("In static Block");
        staticMethod.method1();
        int value = staticMethod.method2();
        System.out.println("Value returned from Static Method2"+value);
    }

    // we can create multiple static method .
    static int method2(){
        System.out.println("Static method2");
        int q= 2;
        return  q;
    }
}
