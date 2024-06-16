//public final abstract class BMW {-----> //The class BMW can be either abstract or final, not both. Final class methods cannot be overridden
// and we need to provide implemantation to the abstract method in child class .
   

public  abstract class BMW {

    public void commonfunc() {

        System.out.println("Common functionality across");
    }

    abstract void accelerate();
    // Also we cannot make abstarct method as static 

}



/* 
Static Methods and Abstract Methods:
1. Static methods belong to the class itself, not to any specific instance.
2. Abstract methods, on the other hand, require implementation in subclasses.

Combining these concepts would lead to a contradiction:
1. Abstract methods imply no implementation (they are placeholders).
2. Static methods always have an implementation (they can be called directly without creating an instance).

Why Static Methods Cannot Be Abstract:
If static methods were allowed to be abstract, it would create confusion:
1. Abstract methods are meant to be overridden by subclasses.
2. Static methods are called directly on the class (no instance required).
There would be no way to provide an overridden implementation for an abstract static method because static methods don’t participate in inheritance chains. */