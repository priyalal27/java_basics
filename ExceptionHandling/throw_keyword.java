public class throw_keyword {


    public static void main(String[] args){
        
       try{ 
        throw new Exception("Funds not available");
           }
       catch(Exception e){
       }    
    }
}
/*throw keyword is used to explicitly throw an exception. You can throw either checked or unchecked exceptions. The throw keyword is followed by an instance of Throwable class (or its subclasses). */