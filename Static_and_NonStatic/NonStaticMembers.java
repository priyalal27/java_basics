public class NonStaticMembers {
    

    // non static variables 
    int a;

    //constructor
    NonStaticMembers(){
        System.out.println("Inside contructor");
    }

    // non static block , we just need to define flower brackets for non static block .
    {
            System.out.println("Non static block");
    }

    public static void main(String[] args) {
        
        System.out.println("Inside Main class");
        // to access non static members i need to create instance of class . Once the class 
        // gets intantiated , first it calls non static block and then it calls constructor .

        new NonStaticMembers();
    }

// Difference between static and non static blocks:
// Static block executes only once when class is loaded . Non static block and contructor 
// are called everytime when we create object of class .



}
