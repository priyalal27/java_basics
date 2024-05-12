public class staticVariable {

    static int a= 22; 
    int b=44 ; 
    public static void main(String[] args) {
        System.out.println(staticVariable.a);
        staticVariable st = new staticVariable();
        System.out.println(st.b);
    }
}


// to access static variable inside static method , first instatiate the class and then call the variable .
// also to access non static variables from static method , first i need to create object of class and then call the variable.