public class c1 extends p1{
    
    int c;
    int d;

    @Override
    public void f1(){

        System.out.println("child method");
    }


    c1(int a, int b, int c, int d){
        super(a,b);
        this.c=c;
        this.d=d;

    }

    public void display(){
        System.out.println("Parent a"+ super.a);
        System.out.println("Parent b"+ super.b);
        System.out.println("Child c"+ this.c);
        System.out.println("Parent a"+ this.d);
        
    }

}

// super methd explicty invokes parent class constructor 