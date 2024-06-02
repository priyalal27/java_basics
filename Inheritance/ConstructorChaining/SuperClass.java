public class SuperClass {

    int x;
    SuperClass(){
        
        System.out.println("Default construtor");
    }

    
    SuperClass(int x){
        this();
        this.x=x;
        System.out.println("Parameterised construtor"+x);
    }
}
