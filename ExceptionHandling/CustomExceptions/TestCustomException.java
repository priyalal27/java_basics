public class TestCustomException {


    public static void main(String[] args) throws Exception {
        
        /*  below keyword will call Unchecked exception class , as it is unchecked 
        exception we may not need to necessarily handle the throw keyword .*/
        //throw new UnCheckedCustomException("Testing Custom Unchecked Exception");


        /*In below keyword we are calling Checked exception class , which in turns 
         * extends Exception class , as this been checked exception i need to 
         * handle the exception explicitly, that is why either it will be surrounded by try/catch 
         * or will be handled by throws keyword which JVM handles  
         */

         throw new CheckedCustomException("Testing Custom Checked Exception");
    }

}
