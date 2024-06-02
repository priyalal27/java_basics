public class ChildClass extends SuperClass{



    
    ChildClass(){
        this(10);
        System.out.println("Default construtor of ChildClass");
    }

    
    ChildClass(int a){
        super(a);
        System.out.println("Parameterised construtor of ChildClass");
    }
}
