public class TestMacBook {

    public static void main(String[] args) {
        
    /*  MacBook m1 = new MacBookAir();
        MacBook m2 = new MacBookPro();
    
        m1.start();
        m1.stop();
        m2.start();;
        m2.stop();

        The above statements shows implementation of run time polymorphism where i have 
        created Parent class reference , referring to child class object .
    */    
        AppleLaptops a1= new MacBookAir(); // upcasting , Child --> Parent
        AppleLaptops a2= new MacBookPro();
        
      //  Object casting : 
      MacBookAir m3 = (MacBookAir)a1; // Parent --> Child
        a1.start();
        a1.stop();
        a2.start();
        a2.stop();

        /*The above implementation shows we can add interface , then a parent class can impelemnt this interface and so forth child class with extend the parent class and override the method  */
            

        /*Suppose I want to refer to one of a child class method , e.g  ProSMethod() which is 
         * specific to MacBookPro class only , in that case if i try to call that method using 
         * a2 , I wont be able to do it . hence I will have to do Object down casting to call method ProsMethod() .
         */

        MacBookPro m4 = (MacBookPro)a2; 
        m4.ProsMethod();

    }

}
