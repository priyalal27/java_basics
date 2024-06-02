public class MultiLevelInheritanceTest {

    public static void main(String[] args) {
        Child1 c= new Child1();
        c.m1();
        c.m2();
        c.hashCode();
    }

}


// Both parent and child shares same memory location :
// output 
// --Parent Memory Allocation Child@28a418fc
// --Child Memory Allocation Child@28a418fc


// jvm instansiates parent class first and then child class 